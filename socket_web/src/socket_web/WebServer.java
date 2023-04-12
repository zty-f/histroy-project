package socket_web;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {
    public static void main(String[] args) throws IOException {
        //首先创建套接字，使用ServerSocket监听8000端口
        ServerSocket ss=new ServerSocket(8001);
        while (true){
            //侦听到要连接到此端口的套接字，并且接收它
            Socket socket=ss.accept();
            new Thread(new Runnable() { //开启一个线程
                @Override
                public void run() {
                    InputStream is= null; //初始化字节输入流对象
                    try {
                        is = socket.getInputStream(); //获取套接字的字节输入流对象
                        //将字节输入流读入到字符输入流，并传入字符输入流
                        BufferedReader br=new BufferedReader(new InputStreamReader(is));
                        String line=br.readLine(); //读取字符输入流的字符，每次读取一行
                        System.out.println(line); //这里打印出获得的请求，以便后面查错GET /NETDemo/Web/hello.html HTTP/1.1
                        String[] arr=line.split(" "); //将请求分解成请求方式、请求地址、请求码
                        String htmlpath=arr[1].substring(9); //得到请求的地址的相对地址，以便找到对应的html文件返回
                        FileInputStream fis=new FileInputStream(htmlpath);//找到文件并返回字节输入流对象
                        OutputStream os=socket.getOutputStream(); //获得套接字的字节输出流对象
                        // 写入HTTP协议响应头,固定写法，不写这个会报错
                        os.write("HTTP/1.1 200 OK\r\n".getBytes());
                        os.write("Content-Type:text/html\r\n".getBytes());
                        // 必须要写入空行,否则浏览器不解析
                        os.write("\r\n".getBytes());
                        //读取文件字节，并通过套接字，相当于返回本地文件到浏览器，那边自动解析文件字节输出流
                        int len=0;
                        byte [] bytes=new byte[1024];
                        while ((len=fis.read(bytes))!=-1){
                            os.write(bytes,0,len);
                        }
                        fis.close();
                        socket.close();
                        os.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }).start();
        }


    }
}
