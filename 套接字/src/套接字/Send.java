package �׽���;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
 
public class Send implements Runnable {
 
    private DatagramSocket datagramSocket = null;
    private  int port;
    // ���幹�췽�� ʹ����Դ��� DatagramSocket  ��Ҫ���ʵĶ˿ںţ�Ȼ��ֵ������
    Send (DatagramSocket datagramSocket, int port){
        this.datagramSocket = datagramSocket;
        this.port = port;
    }
    // �߳�
    @Override
    public void run() {
            // ����һ���ַ�����������
            BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String string = null;
                //byte[] data1 = "��ӭ�� ! ".getBytes();
            while ((string = bufferedReader.readLine()) != null){
                // ��������ַ�����data����
                byte[] data = string.getBytes();
                // ��Ҫ���ʵ�ip��ַ���˿ں� �� ���ݷ���
                DatagramPacket datagramPacket = new DatagramPacket(data, data.length, InetAddress.getByName("localhost"), port);
                //  �������ݱ���ָ�� ip��ַ�Ͷ˿ں�
                datagramSocket.send(datagramPacket);
                // ������ �� �������̨���� bye ��ô���� ����ѭ�� ���ڷ������� ����
                if (string.equals("�ټ�����"))
                {
                  //  System.out.println("����if");
                    break;
                }
            }
            //System.out.println("������");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();  //�ر���
                }
                datagramSocket.close(); // �ر���Դ
            } catch (IOException e) {
                e.printStackTrace();
            }
                
        }
    }
}
