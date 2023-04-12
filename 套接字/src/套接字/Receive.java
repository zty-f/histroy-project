package �׽���;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
 
/**
 *
 *      ������Ϣ�߳�
 *
 */
public class Receive implements Runnable {
    private DatagramSocket datagramSocket = null;
    // ���幹�췽��
    Receive (DatagramSocket datagramSocket){
        this.datagramSocket = datagramSocket;
    }
    // �߳�
    @Override
    public void run() {
        try {
            while (true) {
                // ����һ��1024���ֽ����飬���ڴ�ŷ��͹���������
                byte[] data = new byte[1024];
                // new һ�����ݱ�
                DatagramPacket datagramPacket = new DatagramPacket(data, data.length);
                // �����ȴ����ݷ��͹���
                datagramSocket.receive(datagramPacket);
                // ��ȡ���͹��������ݵ�IP��ַ �� �˿ں�
                String ip = datagramPacket.getAddress().getHostAddress();
                int port = datagramPacket.getPort();
                // ��ȡ���͹���������
                String out = new String(datagramPacket.getData(),0, datagramPacket.getLength());
                // ������͹����������� bye ��ô����ѭ�� ���ڽ�����Ϣ ����
                if ("�ټ�����".equals(out)){
                    System.out.println("  �Է������������  !  ");
                    break;
                }
                // ������ʾ���͹����� IP��ַ �˿ں� ����
                System.out.println("���� ip �� "+ip+"  �˿ں� :  "+port + "  ���� :  "+out);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            datagramSocket.close(); // �ر���Դ
        }
    }
}
