package �׽���;


import java.net.*;
 
public class Jerry {
    public static void main(String[] args) {
    	  try {
              DatagramSocket send = new DatagramSocket(7777);
              DatagramSocket receive = new DatagramSocket(6666);//����  6666  �˿�
              new Thread(new Receive(receive)).start();
              new Thread(new Send(send,8888)).start();// �� 8888  �˿� ��������
          } catch (SocketException e) {
              e.printStackTrace();
          }

    }
}
