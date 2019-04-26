package mytest1;

import java.util.Scanner;

//scanner 类为用户 与 客户端交互，实现键盘的输入



public class ImportScanner
{ 
	public static void main(String[]args) {
//	Scanner s=new Scanner(System.in); 
//	     String str=s.next();
//		程序运行到这时会 被阻塞，等待键盘输入
//	          System.out.println("键盘输入的数为:"+str);        
		test01();
//	          test02();
}
        
	
	public static void test01() {
		Scanner s=new Scanner(System.in); 
	     String str=s.next();
//		程序运行到这时会 被阻塞，等待键盘输入
          System.out.println("键盘输入的数为:"+str);
	}
	
	
	
	
	public static void test02() {
		Scanner s=new Scanner(System.in);
		 
		  System.out.println("键盘输入一个数为:");
		     int a=s.nextInt();
		     System.out.println("键盘输入另一个数为:");
		     int b=s.nextInt();
		        int sum=a+b;
		        System.out.println("两个数和为:"+sum);
		        
	}
	
	
	
	
	
	
	
}
