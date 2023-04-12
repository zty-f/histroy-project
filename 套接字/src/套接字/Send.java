package 套接字;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
 
public class Send implements Runnable {
 
    private DatagramSocket datagramSocket = null;
    private  int port;
    // 定义构造方法 使其可以传入 DatagramSocket  和要访问的端口号，然后赋值给变量
    Send (DatagramSocket datagramSocket, int port){
        this.datagramSocket = datagramSocket;
        this.port = port;
    }
    // 线程
    @Override
    public void run() {
            // 定义一个字符缓冲输入流
            BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String string = null;
                //byte[] data1 = "欢迎你 ! ".getBytes();
            while ((string = bufferedReader.readLine()) != null){
                // 把输入的字符放入data里面
                byte[] data = string.getBytes();
                // 把要访问的ip地址，端口号 和 数据放入
                DatagramPacket datagramPacket = new DatagramPacket(data, data.length, InetAddress.getByName("localhost"), port);
                //  发送数据报到指定 ip地址和端口号
                datagramSocket.send(datagramPacket);
                // 这里是 ： 如果控制台输入 bye 那么代表 跳出循环 不在发送数据 结束
                if (string.equals("再见啦！"))
                {
                  //  System.out.println("进入if");
                    break;
                }
            }
            //System.out.println("出来了");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();  //关闭流
                }
                datagramSocket.close(); // 关闭资源
            } catch (IOException e) {
                e.printStackTrace();
            }
                
        }
    }
}
