package socket_web;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {
    public static void main(String[] args) throws IOException {
        //���ȴ����׽��֣�ʹ��ServerSocket����8000�˿�
        ServerSocket ss=new ServerSocket(8001);
        while (true){
            //������Ҫ���ӵ��˶˿ڵ��׽��֣����ҽ�����
            Socket socket=ss.accept();
            new Thread(new Runnable() { //����һ���߳�
                @Override
                public void run() {
                    InputStream is= null; //��ʼ���ֽ�����������
                    try {
                        is = socket.getInputStream(); //��ȡ�׽��ֵ��ֽ�����������
                        //���ֽ����������뵽�ַ����������������ַ�������
                        BufferedReader br=new BufferedReader(new InputStreamReader(is));
                        String line=br.readLine(); //��ȡ�ַ����������ַ���ÿ�ζ�ȡһ��
                        System.out.println(line); //�����ӡ����õ������Ա������GET /NETDemo/Web/hello.html HTTP/1.1
                        String[] arr=line.split(" "); //������ֽ������ʽ�������ַ��������
                        String htmlpath=arr[1].substring(9); //�õ�����ĵ�ַ����Ե�ַ���Ա��ҵ���Ӧ��html�ļ�����
                        FileInputStream fis=new FileInputStream(htmlpath);//�ҵ��ļ��������ֽ�����������
                        OutputStream os=socket.getOutputStream(); //����׽��ֵ��ֽ����������
                        // д��HTTPЭ����Ӧͷ,�̶�д������д����ᱨ��
                        os.write("HTTP/1.1 200 OK\r\n".getBytes());
                        os.write("Content-Type:text/html\r\n".getBytes());
                        // ����Ҫд�����,���������������
                        os.write("\r\n".getBytes());
                        //��ȡ�ļ��ֽڣ���ͨ���׽��֣��൱�ڷ��ر����ļ�����������Ǳ��Զ������ļ��ֽ������
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
