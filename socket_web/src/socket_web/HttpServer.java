package socket_web;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer extends Thread {
    //���ȴ����׽��֣�ʹ��ServerSocket����8000�˿�
    ServerSocket serverSocket = new ServerSocket(8001);
    public HttpServer() throws IOException {
    }
    public void run() {//����һ���߳�
        while (true) {
            try {
                //������Ҫ���ӵ��˶˿ڵ��׽��֣����ҽ�����
                Socket socket = serverSocket.accept();
                //���ֽ����������뵽�ַ����������������ַ�������
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String str = bufferedReader.readLine();//��ȡ�ַ����������ַ���ÿ�ζ�ȡһ��
                System.out.println(str);//�����ӡ����õ������Ա������GET /NETDemo/Web/hello.html HTTP/1.1
                String path = str.split(" ")[1].substring(9);//������ֽ������ʽ�������ַ��������
                FileInputStream fs = new FileInputStream(path);//�õ�����ĵ�ַ����Ե�ַ���Ա��ҵ���Ӧ��html�ļ�����
                OutputStream os = socket.getOutputStream();//����׽��ֵ��ֽ����������
                // д��HTTPЭ����Ӧͷ,�̶�д��
                os.write("HTTP/1.1 200 OK\r\n".getBytes());
                os.write("Content-Type:text/html\r\n".getBytes());
                // ����Ҫд�����,���������������
                os.write("\r\n".getBytes());
                //��ȡ�ļ��ֽڣ���ͨ���׽��֣��൱�ڷ��ر����ļ�����������Ǳ��Զ������ļ��ֽ������
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
            HttpServer httpServer = new HttpServer();//����HttpServer����
            httpServer.start(); //�����߳�
        }
    }
}
 