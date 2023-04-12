package 天然气储量管理系统;

import java.util.Scanner;
//通过几个数组来对天然气信息进行所需功能的实现。
public class TRQData {
  private String[] GFname = new String[50];  //   天然气气田名字数组
  private String[] GFarea = new String[50];   //  天然气气田气区数组
  private String[] GFtype = new String[50];   //   天然气气田气藏类型数组
  private String[] GFBDtype = new String[50];  //  天然气气田埋深类型数组
  private  double[] GFreserve = new double[50];  //  天然气气田储量数组
public TRQData() { //无参构造方法,在创建对象的同时对成员变量的数组进行初步创建天然气信息
	createdata();
}
public void createdata() {     //初步构建此天然气系统的初始信息
	
	    this.GFname[0] = "大牛地";
        this.GFarea[0] = "陕甘宁盆地";
        this.GFtype[0] = "致密气";
        this.GFBDtype[0] = "浅层气";
        this.GFreserve[0] = 4131.26;
         
        this.GFname[1] = "迪那2";
        this.GFarea[1] = "塔里木盆地";
        this.GFtype[1] = "致密气";
        this.GFBDtype[1] = "深层气";
        this.GFreserve[1] = 1752.18;
        
        this.GFname[2] = "涪陵岩层";
        this.GFarea[2] = "四川盆地";
        this.GFtype[2] = "页岩气";
        this.GFBDtype[2] = "深层气";
        this.GFreserve[2] = 1067.54;

        this.GFname[3] = "靖边";
        this.GFarea[3] = "陕甘宁盆地";
        this.GFtype[3] = "煤层气";
        this.GFBDtype[3] = "浅层气";
        this.GFreserve[3] = 3458.79;

        this.GFname[4] = "克拉2";
        this.GFarea[4] = "塔里木盆地";
        this.GFtype[4] = "致密气";
        this.GFBDtype[4] = "深层气";
        this.GFreserve[4] = 2506.17;

        this.GFname[5] = "克深";
        this.GFarea[5] = "塔里木盆地";
        this.GFtype[5] = "常规气";
        this.GFBDtype[5] = "深层气";
        this.GFreserve[5] = 2050.43;
    
        this.GFname[6] = "龙王庙";
        this.GFarea[6] = "四川盆地";
        this.GFtype[6] = "常规气";
        this.GFBDtype[6] = "中浅层气";
        this.GFreserve[6] = 4403.83;
        
        this.GFname[7] = "南八仙";
        this.GFarea[7] = "柴达木盆地";
        this.GFtype[7] = "常规气";
        this.GFBDtype[7] = "浅层气";
        this.GFreserve[7] = 131.65;
        
        this.GFname[8] = "普光";
        this.GFarea[8] = "四川盆地";
        this.GFtype[8] = "岩层气";
        this.GFBDtype[8] = "深层气";
        this.GFreserve[8] = 4050.79;
   
        this.GFname[9] = "涩北";
        this.GFarea[9] = "柴达木盆地";
        this.GFtype[9] = "常规气";
        this.GFBDtype[9] = "浅层气";
        this.GFreserve[9] = 2878.81;

        this.GFname[10] = "苏里格";
        this.GFarea[10] = "陕甘宁盆地";
        this.GFtype[10] = "常规气";
        this.GFBDtype[10] = "中浅层气";
        this.GFreserve[10] = 5536.52;

        this.GFname[11] = "台南";
        this.GFarea[11] = "柴达木盆地";
        this.GFtype[11] = "常规气";
        this.GFBDtype[11] = "浅层气";
        this.GFreserve[11] = 951.63;

        this.GFname[12] = "元坝";
        this.GFarea[12] = "四川盆地";
        this.GFtype[12] = "常规气";
        this.GFBDtype[12] = "浅层气";
        this.GFreserve[12] = 1592.53;
    }
  public void add() {      //实现添加气田的方法
      Scanner name = new Scanner(System.in);
      Scanner area = new Scanner(System.in);
      Scanner type = new Scanner(System.in);
      Scanner bdtype = new Scanner(System.in);
      Scanner reserve = new Scanner(System.in);
      System.out.println("请按照格式输入气田数据：气田名(字符串);气区(字符串);气藏类型(字符串);埋深类型(字符串);储量(>=0的数字)");
      System.out.println("！总共需要输入五个数据，每输入完成一个数据后按回车键继续输入下一个数据！");
      System.out.print("请输入数据：");
      String name1 = name.next();
      String area1 = area.next();
      String type1 = type.next();
      String bdtype1 = bdtype.next();
      double reserve1 = reserve.nextDouble();
      for (int i = 0; i <this.GFname.length; i++) {
          if (this.GFname[i] == null) 
          {
              this.GFname[i] = name1;
              this.GFarea[i] = area1;
              this.GFtype[i] = type1;
              this.GFBDtype[i] = bdtype1;
              this.GFreserve[i] = reserve1;
              System.out.println("*************");
              System.out.println("添加气田成功！");
              System.out.println("*************");
              break;
          }
      }
  }

  public void delete() {   //实现删除气田的方法
      System.out.println("请输入要删除的气田名称:");
      Scanner input = new Scanner(System.in);
      String s = input.next();
      int flag=0;
      for (int i = 0; this.GFname[i] != null; i++) {
          if (this.GFname[i].equals(s)) {
              flag = 1;
              for (int j = i; j < this.GFname.length - 1; j++) { //使用for循环对删除后的数组重新排列完整
                  this.GFname[j] = this.GFname[j + 1];
                  this.GFarea[j] = this.GFarea[j + 1];
                  this.GFtype[j] = this.GFtype[j + 1];
                  this.GFBDtype[j] = this.GFBDtype[j + 1];
                  this.GFreserve[j] = this.GFreserve[j + 1];
              }
              System.out.println("************");
              System.out.println("删除气田成功!");
              System.out.println("************");
              break;
          }

      }
      if (flag==0) {
          System.out.println("没有在该系统中找到该气田的信息，请核对后重新查询！");
      }
      System.out.println("*******************************************");
  }

  public void selectall() {   //查询此系统中所有气田信息的方法
	  System.out.println("此系统中气田信息查询结果如下：");
      System.out.println("*****************************************************");
      System.out.println("        气田名      气区      气藏类型       埋深类型     储量（亿方）");
      int xuhao=1;
	  for(int i=0;i<this.GFname.length;i++)
	  {
		  if(this.GFname[i]!=null)
		  {
			  System.out.println("("+xuhao+")"+" "+this.GFname[i] + "    " + this.GFarea[i] + "    " + this.GFtype[i] + "    " + this.GFBDtype[i] + "    " + this.GFreserve[i]);
		      xuhao++;
		  }
	  }
	  System.out.println("*****************************************************");
  }
  public void selectbyarea() { //按气区查询气田信息的方法
	  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      System.out.println("请输入所需查询气区的名称,按回车键结束输入并且开始查询！");
      Scanner input = new Scanner(System.in);
      String x = input.next();
      System.out.println("查询结果如下：");
      System.out.println("*****************************************************");
      System.out.println("        气田名      气区      气藏类型       埋深类型     储量（亿方）");
      int xuhao=1;
      for (int i = 0; this.GFarea[i] != null; i++) {
          if (this.GFarea[i].equals(x)) { 
              System.out.println("("+xuhao+")"+" "+this.GFname[i] + "    " + this.GFarea[i] + "    " + this.GFtype[i] + "    " + this.GFBDtype[i] + "    " + this.GFreserve[i]);
              xuhao++;
          }
      }
      System.out.println("*****************************************************");
  }

  public void selectbytype() {  //按气藏类型查询汇总的各气区储量的方法
	  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      System.out.println("请输入所需查询气藏类型的名称，按回车键结束输入并且开始查询！");
      Scanner input = new Scanner(System.in);
      String x = input.next();
      double sum1 =0;
      double sum2 =0;
      double sum3 =0;
      double sum4 =0;
      for (int i = 0; this.GFtype[i] != null; i++) {
          if (this.GFtype[i].equals(x)) {
             if(this.GFarea[i].equals("塔里木盆地")) {
            	 sum1=sum1+this.GFreserve[i];
              }
             else if(this.GFarea[i].equals("四川盆地")) {
            	 sum2=sum2+this.GFreserve[i];
             }
             else if(this.GFarea[i].equals("柴达木盆地")) {
            	 sum3=sum3+this.GFreserve[i];
             }
              else if(this.GFarea[i].equals("陕甘宁盆地")) {
            	  sum4=sum4+this.GFreserve[i];
             }
             
          }
      }
      double sum[]=new double[4];
      sum[0]=sum1;sum[1]=sum2;sum[2]=sum3;sum[3]=sum4;
      System.out.println("^^^^^^^^^^^^^^^^^^");
      System.out.println("气区            储量");
      for (int i = 0; i <4; i++) {
          if (i==0) {
              System.out.println("塔里木盆地" + "    " + sum[i]);
          }
          else if (i==1) {
              System.out.println("四川盆地" + "    " + sum[i]);
          }
          else if (i==2) {
              System.out.println("柴达木盆地" + "    " + sum[i]);
          }
          else if (i==3) {
              System.out.println("陕甘宁盆地" + "    " + sum[i]);
          }

      }
      System.out.println("^^^^^^^^^^^^^^^^^^");
  }

  public void selectbydepth() {   //按埋深类型查询汇总的各气区储量的方法
	  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      System.out.println("请输入所需查询埋深类型的名称，按回车键结束输入并且开始查询！");
      Scanner input = new Scanner(System.in);
      String x = input.next();
      double sum1 =0;
      double sum2 =0;
      double sum3 =0;
      double sum4 =0;
      for (int i = 0; this.GFBDtype[i] != null; i++) {
          if (this.GFBDtype[i].equals(x)) {
             if(this.GFarea[i].equals("塔里木盆地")) {
            	 sum1=sum1+this.GFreserve[i];
              }
             else if(this.GFarea[i].equals("四川盆地")) {
            	 sum2=sum2+this.GFreserve[i];
             }
             else if(this.GFarea[i].equals("柴达木盆地")) {
            	 sum3=sum3+this.GFreserve[i];
             }
              else if(this.GFarea[i].equals("陕甘宁盆地")) {
            	  sum4=sum4+this.GFreserve[i];
             }
             
          }
      }
      double sum[]=new double[4];
      sum[0]=sum1;sum[1]=sum2;sum[2]=sum3;sum[3]=sum4;
      System.out.println("^^^^^^^^^^^^^^^^^^");
      System.out.println("气区             储量");
      for (int i = 0; i <4; i++) {
          if (i==0) {
              System.out.println("塔里木盆地" + "    " + sum[i]);
          }
          else if (i==1) {
              System.out.println("四川盆地" + "    " + sum[i]);
          }
          else if (i==2) {
              System.out.println("柴达木盆地" + "    " + sum[i]);
          }
          else if (i==3) {
              System.out.println("陕甘宁盆地" + "    " + sum[i]);
          }

      }
      System.out.println("^^^^^^^^^^^^^^^^^^");
  }


  public void totalreserver() {  //查询此系统中中国天然气总储量的方法
	  System.out.println("******************************");
      System.out.println("中国天然气总储量：");
      double sum = 0.0;
      for (int i = 0;i<this.GFname.length; i++) {
          if (this.GFname[i] != null) {
              sum = sum + this.GFreserve[i];
          }
      }
      String x=String.format("%.2f", sum);
      System.out.println(x+"(亿方)");
  }


}