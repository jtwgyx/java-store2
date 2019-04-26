package mytest1;
  
//   用 递归实现 一个数的阶乘， 递归即 反复的调用自身的方法



public class recursion
{ public static int test(int n) {
	if(n==1) {
		return 1;      
//		排除n==1的这种特殊情况
		
	}else {
		return n*test(n-1);
//		 关键代码
	}
	
}



public static int test02(int m) {
	int r=1;
	for(int i=m;i>0;i--) {
		 r*=i;
	}

	return r;
}











public static void main(String[] args) {

	 System.out.println(test(6));
//	int s=test02(6);
//	 System.out.println(s);
	 System.out.println(test02(1));
}

}



