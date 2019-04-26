package mytest1;

public class breakContinue
{    
//	测试 break语句， break语句作用为中止此次循环，不再执行下一次循环
	
	
	public static void main(String[]args) {
	 int tatal=0;
	 System.out.println("Begin");
	 while(true){
//		 while(true)为死循环
		 tatal++;
		 int i=(int)Math.round(100*Math.random());
//		数学方法， 在100范围内，随机选择一个数 赋值给 i,tatal 为 随机选择的次数
		 if(i==88) {
			 break;
		 }
	 }
		 System.out.println("GameOver,used " +tatal+ " times");
	 
		 System.out.println("##########################");
	 
		 
		 
//		 continue的作用为  结束本次循环进行下一次循环，
		 
		 
		 
		 
		  
		 for(int i=1;i<=200;i++) {
			  if(i%3==0) {
				  continue;
			  }
			  System.out.println(i);
		 }
//输出的为：不能被3整除的数
		
}

}
