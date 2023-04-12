package 套接字;

import java.net.DatagramSocket;
import java.net.SocketException;
 
public class Tom
{
    public static void main(String[] args) {
    	 try {
             DatagramSocket send = new DatagramSocket(9999);
             DatagramSocket receive = new DatagramSocket(8888);
             new Thread(new Receive(receive)).start();   //监听  8888  端口
             new Thread(new Send(send,6666)).start();  // 给 6666  端口 发送数据
         } catch (SocketException e) {
             e.printStackTrace();
         }

    }
}
