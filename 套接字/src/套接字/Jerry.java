package 套接字;


import java.net.*;
 
public class Jerry {
    public static void main(String[] args) {
    	  try {
              DatagramSocket send = new DatagramSocket(7777);
              DatagramSocket receive = new DatagramSocket(6666);//监听  6666  端口
              new Thread(new Receive(receive)).start();
              new Thread(new Send(send,8888)).start();// 给 8888  端口 发送数据
          } catch (SocketException e) {
              e.printStackTrace();
          }

    }
}
