package socket_web;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer extends Thread {
    //首先创建套接字，使用ServerSocket监听8000端口
    ServerSocket serverSocket = new ServerSocket(8001);
    public HttpServer() throws IOException {
    }
    public void run() {//开启一个线程
        while (true) {
            try {
                //侦听到要连接到此端口的套接字，并且接收它
                Socket socket = serverSocket.accept();
                //将字节输入流读入到字符输入流，并传入字符输入流
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String str = bufferedReader.readLine();//读取字符输入流的字符，每次读取一行
                System.out.println(str);//这里打印出获得的请求，以便后面查错GET /NETDemo/Web/hello.html HTTP/1.1
                String path = str.split(" ")[1].substring(9);//将请求分解成请求方式、请求地址、请求码
                FileInputStream fs = new FileInputStream(path);//得到请求的地址的相对地址，以便找到对应的html文件返回
                OutputStream os = socket.getOutputStream();//获得套接字的字节输出流对象
                // 写入HTTP协议响应头,固定写法
                os.write("HTTP/1.1 200 OK\r\n".getBytes());
                os.write("Content-Type:text/html\r\n".getBytes());
                // 必须要写入空行,否则浏览器不解析
                os.write("\r\n".getBytes());
                //读取文件字节，并通过套接字，相当于返回本地文件到浏览器，那边自动解析文件字节输出流
                int len = 0;
                byte[] bytes = new byte[1024];
                while ((len = fs.read(bytes)) != -1) {
                    os.write(bytes, 0, len);
                }
                fs.close();
                os.close();
                socket.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static class Start {
        public static void main(String[] args) throws IOException {
            HttpServer httpServer = new HttpServer();//创建HttpServer对象
            httpServer.start(); //开启线程
        }
    }
}
 