package �׽���;

import java.net.DatagramSocket;
import java.net.SocketException;
 
public class Tom
{
    public static void main(String[] args) {
    	 try {
             DatagramSocket send = new DatagramSocket(9999);
             DatagramSocket receive = new DatagramSocket(8888);
             new Thread(new Receive(receive)).start();   //����  8888  �˿�
             new Thread(new Send(send,6666)).start();  // �� 6666  �˿� ��������
         } catch (SocketException e) {
             e.printStackTrace();
         }

    }
}
