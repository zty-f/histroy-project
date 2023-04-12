package 天然气存储管理系统;

import java.util.Scanner;

public class  TRQMS {
	TRQData  x=new TRQData();
    public void Function() {  //该方法供用户选择功能，连接select方法进行不同输入不同功能实现。
        System.out.println("@天然气管理系统@");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("0——添加气田");
        System.out.println("1——删除气田");
        System.out.println("2——查询此系统中所有气田信息");
        System.out.println("3——按气区查询气田信息");
        System.out.println("4——按气藏类型查询汇总的各气区储量");
        System.out.println("5——按埋深类型查询汇总的各气区储量");
        System.out.println("6——查询此系统中中国天然气总储量");
        System.out.println("7——退出系统");
        System.out.println("***********************************");
        System.out.print("请根据所需使用的功能输入对应序号：");
     select();
    }
public void select()   //该方法通过用户输入的数字对应所需要的方法
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
            System.out.println("系统已退出，谢谢使用！");
            break;
     default:
            System.out.println("输入错误！请重新输入！"); 
            select();
         break;  
        }
        
 }

    public void Rturn() //返回功能选择页面的函数
      { 
        Scanner input = new Scanner(System.in);
        System.out.print("请按回车键返回主菜单");
        if (input.nextLine().length()==0) {
        	Function();
        } else {
            System.out.println("输入错误，异常终止！请重新启动该系统！谢谢^_^");
        }
     }

}

 class qidong //天然气系统启动的转折连接main函数，进入功能选择区
 {   
    public static void main(String[] args)
    {
        TRQMS theme = new TRQMS(); //创建管理系统的对象
        theme.Function();   //通过对象调用功能方法
        
    }
 }