package ��Ȼ���洢����ϵͳ;

import java.util.Scanner;

public class  TRQMS {
	TRQData  x=new TRQData();
    public void Function() {  //�÷������û�ѡ���ܣ�����select�������в�ͬ���벻ͬ����ʵ�֡�
        System.out.println("@��Ȼ������ϵͳ@");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("0�����������");
        System.out.println("1����ɾ������");
        System.out.println("2������ѯ��ϵͳ������������Ϣ");
        System.out.println("3������������ѯ������Ϣ");
        System.out.println("4�������������Ͳ�ѯ���ܵĸ���������");
        System.out.println("5�������������Ͳ�ѯ���ܵĸ���������");
        System.out.println("6������ѯ��ϵͳ���й���Ȼ���ܴ���");
        System.out.println("7�����˳�ϵͳ");
        System.out.println("***********************************");
        System.out.print("���������ʹ�õĹ��������Ӧ��ţ�");
     select();
    }
public void select()   //�÷���ͨ���û���������ֶ�Ӧ����Ҫ�ķ���
            {
       Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch(choice){
        case 0:
            x.add();
            Rturn();
            break;
        case 1:
            x.delete();
            Rturn();
            break;
        case 2:
            x.selectall();
            Rturn();
            break;
        case 3:
        	x.selectbyarea();
            Rturn();
            break;
        case 4:
        	x.selectbytype();
            Rturn();
            break;
        case 5:
        	x.selectbydepth();
            Rturn();
            break;
        case 6:
        	x.totalreserver();
            Rturn();
            break;
        case 7:
            System.out.println("ϵͳ���˳���ллʹ�ã�");
            break;
     default:
            System.out.println("����������������룡"); 
            select();
         break;  
        }
        
 }

    public void Rturn() //���ع���ѡ��ҳ��ĺ���
      { 
        Scanner input = new Scanner(System.in);
        System.out.print("�밴�س����������˵�");
        if (input.nextLine().length()==0) {
        	Function();
        } else {
            System.out.println("��������쳣��ֹ��������������ϵͳ��лл^_^");
        }
     }

}

 class qidong //��Ȼ��ϵͳ������ת������main���������빦��ѡ����
 {   
    public static void main(String[] args)
    {
        TRQMS theme = new TRQMS(); //��������ϵͳ�Ķ���
        theme.Function();   //ͨ��������ù��ܷ���
        
    }
 }