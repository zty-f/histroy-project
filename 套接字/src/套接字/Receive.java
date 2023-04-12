package 套接字;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
 
/**
 *
 *      接收消息线程
 *
 */
public class Receive implements Runnable {
    private DatagramSocket datagramSocket = null;
    // 定义构造方法
    Receive (DatagramSocket datagramSocket){
        this.datagramSocket = datagramSocket;
    }
    // 线程
    @Override
    public void run() {
        try {
            while (true) {
                // 定义一个1024到字节数组，用于存放发送过来到数据
                byte[] data = new byte[1024];
                // new 一个数据报
                DatagramPacket datagramPacket = new DatagramPacket(data, data.length);
                // 阻塞等待数据发送过来
                datagramSocket.receive(datagramPacket);
                // 获取发送过来的数据的IP地址 和 端口号
                String ip = datagramPacket.getAddress().getHostAddress();
                int port = datagramPacket.getPort();
                // 获取传送过来的数据
                String out = new String(datagramPacket.getData(),0, datagramPacket.getLength());
                // 如果传送过来的数据是 bye 那么跳出循环 不在接收消息 结束
                if ("再见啦！".equals(out)){
                    System.out.println("  对方离结束了聊天  !  ");
                    break;
                }
                // 用来显示发送过来的 IP地址 端口号 内容
                System.out.println("来自 ip ： "+ip+"  端口号 :  "+port + "  内容 :  "+out);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            datagramSocket.close(); // 关闭资源
        }
    }
}
