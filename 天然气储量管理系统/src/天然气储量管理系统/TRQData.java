package ��Ȼ����������ϵͳ;

import java.util.Scanner;
//ͨ����������������Ȼ����Ϣ�������蹦�ܵ�ʵ�֡�
public class TRQData {
  private String[] GFname = new String[50];  //   ��Ȼ��������������
  private String[] GFarea = new String[50];   //  ��Ȼ��������������
  private String[] GFtype = new String[50];   //   ��Ȼ������������������
  private String[] GFBDtype = new String[50];  //  ��Ȼ������������������
  private  double[] GFreserve = new double[50];  //  ��Ȼ�����ﴢ������
public TRQData() { //�޲ι��췽��,�ڴ��������ͬʱ�Գ�Ա������������г���������Ȼ����Ϣ
	createdata();
}
public void createdata() {     //������������Ȼ��ϵͳ�ĳ�ʼ��Ϣ
	
	    this.GFname[0] = "��ţ��";
        this.GFarea[0] = "�¸������";
        this.GFtype[0] = "������";
        this.GFBDtype[0] = "ǳ����";
        this.GFreserve[0] = 4131.26;
         
        this.GFname[1] = "����2";
        this.GFarea[1] = "����ľ���";
        this.GFtype[1] = "������";
        this.GFBDtype[1] = "�����";
        this.GFreserve[1] = 1752.18;
        
        this.GFname[2] = "�����Ҳ�";
        this.GFarea[2] = "�Ĵ����";
        this.GFtype[2] = "ҳ����";
        this.GFBDtype[2] = "�����";
        this.GFreserve[2] = 1067.54;

        this.GFname[3] = "����";
        this.GFarea[3] = "�¸������";
        this.GFtype[3] = "ú����";
        this.GFBDtype[3] = "ǳ����";
        this.GFreserve[3] = 3458.79;

        this.GFname[4] = "����2";
        this.GFarea[4] = "����ľ���";
        this.GFtype[4] = "������";
        this.GFBDtype[4] = "�����";
        this.GFreserve[4] = 2506.17;

        this.GFname[5] = "����";
        this.GFarea[5] = "����ľ���";
        this.GFtype[5] = "������";
        this.GFBDtype[5] = "�����";
        this.GFreserve[5] = 2050.43;
    
        this.GFname[6] = "������";
        this.GFarea[6] = "�Ĵ����";
        this.GFtype[6] = "������";
        this.GFBDtype[6] = "��ǳ����";
        this.GFreserve[6] = 4403.83;
        
        this.GFname[7] = "�ϰ���";
        this.GFarea[7] = "���ľ���";
        this.GFtype[7] = "������";
        this.GFBDtype[7] = "ǳ����";
        this.GFreserve[7] = 131.65;
        
        this.GFname[8] = "�չ�";
        this.GFarea[8] = "�Ĵ����";
        this.GFtype[8] = "�Ҳ���";
        this.GFBDtype[8] = "�����";
        this.GFreserve[8] = 4050.79;
   
        this.GFname[9] = "ɬ��";
        this.GFarea[9] = "���ľ���";
        this.GFtype[9] = "������";
        this.GFBDtype[9] = "ǳ����";
        this.GFreserve[9] = 2878.81;

        this.GFname[10] = "�����";
        this.GFarea[10] = "�¸������";
        this.GFtype[10] = "������";
        this.GFBDtype[10] = "��ǳ����";
        this.GFreserve[10] = 5536.52;

        this.GFname[11] = "̨��";
        this.GFarea[11] = "���ľ���";
        this.GFtype[11] = "������";
        this.GFBDtype[11] = "ǳ����";
        this.GFreserve[11] = 951.63;

        this.GFname[12] = "Ԫ��";
        this.GFarea[12] = "�Ĵ����";
        this.GFtype[12] = "������";
        this.GFBDtype[12] = "ǳ����";
        this.GFreserve[12] = 1592.53;
    }
  public void add() {      //ʵ���������ķ���
      Scanner name = new Scanner(System.in);
      Scanner area = new Scanner(System.in);
      Scanner type = new Scanner(System.in);
      Scanner bdtype = new Scanner(System.in);
      Scanner reserve = new Scanner(System.in);
      System.out.println("�밴�ո�ʽ�����������ݣ�������(�ַ���);����(�ַ���);��������(�ַ���);��������(�ַ���);����(>=0������)");
      System.out.println("���ܹ���Ҫ����������ݣ�ÿ�������һ�����ݺ󰴻س�������������һ�����ݣ�");
      System.out.print("���������ݣ�");
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
              System.out.println("�������ɹ���");
              System.out.println("*************");
              break;
          }
      }
  }

  public void delete() {   //ʵ��ɾ������ķ���
      System.out.println("������Ҫɾ������������:");
      Scanner input = new Scanner(System.in);
      String s = input.next();
      int flag=0;
      for (int i = 0; this.GFname[i] != null; i++) {
          if (this.GFname[i].equals(s)) {
              flag = 1;
              for (int j = i; j < this.GFname.length - 1; j++) { //ʹ��forѭ����ɾ���������������������
                  this.GFname[j] = this.GFname[j + 1];
                  this.GFarea[j] = this.GFarea[j + 1];
                  this.GFtype[j] = this.GFtype[j + 1];
                  this.GFBDtype[j] = this.GFBDtype[j + 1];
                  this.GFreserve[j] = this.GFreserve[j + 1];
              }
              System.out.println("************");
              System.out.println("ɾ������ɹ�!");
              System.out.println("************");
              break;
          }

      }
      if (flag==0) {
          System.out.println("û���ڸ�ϵͳ���ҵ����������Ϣ����˶Ժ����²�ѯ��");
      }
      System.out.println("*******************************************");
  }

  public void selectall() {   //��ѯ��ϵͳ������������Ϣ�ķ���
	  System.out.println("��ϵͳ��������Ϣ��ѯ������£�");
      System.out.println("*****************************************************");
      System.out.println("        ������      ����      ��������       ��������     �������ڷ���");
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
  public void selectbyarea() { //��������ѯ������Ϣ�ķ���
	  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      System.out.println("�����������ѯ����������,���س����������벢�ҿ�ʼ��ѯ��");
      Scanner input = new Scanner(System.in);
      String x = input.next();
      System.out.println("��ѯ������£�");
      System.out.println("*****************************************************");
      System.out.println("        ������      ����      ��������       ��������     �������ڷ���");
      int xuhao=1;
      for (int i = 0; this.GFarea[i] != null; i++) {
          if (this.GFarea[i].equals(x)) { 
              System.out.println("("+xuhao+")"+" "+this.GFname[i] + "    " + this.GFarea[i] + "    " + this.GFtype[i] + "    " + this.GFBDtype[i] + "    " + this.GFreserve[i]);
              xuhao++;
          }
      }
      System.out.println("*****************************************************");
  }

  public void selectbytype() {  //���������Ͳ�ѯ���ܵĸ����������ķ���
	  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      System.out.println("�����������ѯ�������͵����ƣ����س����������벢�ҿ�ʼ��ѯ��");
      Scanner input = new Scanner(System.in);
      String x = input.next();
      double sum1 =0;
      double sum2 =0;
      double sum3 =0;
      double sum4 =0;
      for (int i = 0; this.GFtype[i] != null; i++) {
          if (this.GFtype[i].equals(x)) {
             if(this.GFarea[i].equals("����ľ���")) {
            	 sum1=sum1+this.GFreserve[i];
              }
             else if(this.GFarea[i].equals("�Ĵ����")) {
            	 sum2=sum2+this.GFreserve[i];
             }
             else if(this.GFarea[i].equals("���ľ���")) {
            	 sum3=sum3+this.GFreserve[i];
             }
              else if(this.GFarea[i].equals("�¸������")) {
            	  sum4=sum4+this.GFreserve[i];
             }
             
          }
      }
      double sum[]=new double[4];
      sum[0]=sum1;sum[1]=sum2;sum[2]=sum3;sum[3]=sum4;
      System.out.println("^^^^^^^^^^^^^^^^^^");
      System.out.println("����            ����");
      for (int i = 0; i <4; i++) {
          if (i==0) {
              System.out.println("����ľ���" + "    " + sum[i]);
          }
          else if (i==1) {
              System.out.println("�Ĵ����" + "    " + sum[i]);
          }
          else if (i==2) {
              System.out.println("���ľ���" + "    " + sum[i]);
          }
          else if (i==3) {
              System.out.println("�¸������" + "    " + sum[i]);
          }

      }
      System.out.println("^^^^^^^^^^^^^^^^^^");
  }

  public void selectbydepth() {   //���������Ͳ�ѯ���ܵĸ����������ķ���
	  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      System.out.println("�����������ѯ�������͵����ƣ����س����������벢�ҿ�ʼ��ѯ��");
      Scanner input = new Scanner(System.in);
      String x = input.next();
      double sum1 =0;
      double sum2 =0;
      double sum3 =0;
      double sum4 =0;
      for (int i = 0; this.GFBDtype[i] != null; i++) {
          if (this.GFBDtype[i].equals(x)) {
             if(this.GFarea[i].equals("����ľ���")) {
            	 sum1=sum1+this.GFreserve[i];
              }
             else if(this.GFarea[i].equals("�Ĵ����")) {
            	 sum2=sum2+this.GFreserve[i];
             }
             else if(this.GFarea[i].equals("���ľ���")) {
            	 sum3=sum3+this.GFreserve[i];
             }
              else if(this.GFarea[i].equals("�¸������")) {
            	  sum4=sum4+this.GFreserve[i];
             }
             
          }
      }
      double sum[]=new double[4];
      sum[0]=sum1;sum[1]=sum2;sum[2]=sum3;sum[3]=sum4;
      System.out.println("^^^^^^^^^^^^^^^^^^");
      System.out.println("����             ����");
      for (int i = 0; i <4; i++) {
          if (i==0) {
              System.out.println("����ľ���" + "    " + sum[i]);
          }
          else if (i==1) {
              System.out.println("�Ĵ����" + "    " + sum[i]);
          }
          else if (i==2) {
              System.out.println("���ľ���" + "    " + sum[i]);
          }
          else if (i==3) {
              System.out.println("�¸������" + "    " + sum[i]);
          }

      }
      System.out.println("^^^^^^^^^^^^^^^^^^");
  }


  public void totalreserver() {  //��ѯ��ϵͳ���й���Ȼ���ܴ����ķ���
	  System.out.println("******************************");
      System.out.println("�й���Ȼ���ܴ�����");
      double sum = 0.0;
      for (int i = 0;i<this.GFname.length; i++) {
          if (this.GFname[i] != null) {
              sum = sum + this.GFreserve[i];
          }
      }
      String x=String.format("%.2f", sum);
      System.out.println(x+"(�ڷ�)");
  }


}