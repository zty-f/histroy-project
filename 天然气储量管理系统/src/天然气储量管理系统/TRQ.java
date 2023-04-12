package 天然气储量管理系统;

public class TRQ //天然气系统启动的转折连接main函数，进入功能选择区
{   
   public static void main(String[] args)
   {
       TRQMS theme = new TRQMS(); //创建管理系统的对象
       theme.Function();   //通过对象调用功能方法   
   }
}
