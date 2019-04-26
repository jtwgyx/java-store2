package mytest1;

public class mytest2_method
{   
//	求一定范围内 奇数的和与偶数的和
	
	
	public static void test01(int a) {
		int oddSum=0;
		int evenSum=0;
	  for(int i=1;i<=a;i++) {
		  if(i%2==0) {
			  oddSum+=i;
		  }
		  else {
			  evenSum+=i;
		  }
	  }
	
	System.out.println("奇数之和为:"+oddSum);
	System.out.println("偶数之和为:"+evenSum);
	
}

	public static void test02(int a,int b,int c) {
		for(int i=1;i<=a;i++) {
			if(i%b==0) {
				System.out.print(i+"\t");
			}
			if(i%(b*c)==0) {
				System.out.println();
			}
		}
	}
	
	
	public static int test03(int a,int b,int c){
		int sum=a+b+c;
		if(a==3) {
			return 0;
		}
	System.out.println("输出");
		return sum;
	}
	
	


public static void main(String[] args) {
	test01(100);
	 test02(100,6,3);
	  int s=test03(3,2,3);
	  System.out.println(s);
}
}