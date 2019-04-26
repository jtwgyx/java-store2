package mytest1;
//    一个类中可以有相同名字，但参数不同的多个方法。
//    调用时 会根据参数的不同选择对应的方法。 
//    
//方法的重载：1.类名相同，  方法名相同,同一个类下
//            2.参数： 个数，类型，【顺序】不同
//             3.只有形参的【名称】不同，不构成方法的重载 ，如method(int a,int b)和method(int c,int d)
//4.【构造方法也可以重载】

public class testOverload
{    
	public int add(int a,int b){
		return (a+b);
	}
	
	public int add(double a,int b){
		return (int)(a+b);
	}
	
	public static void main(String arg[]){
	testOverload t=new testOverload();
//	t.add(3,5);
	int result=t.add(3.8,5);
MyMath m=new MyMath();
double result2=m.add(5,2,2.3);
   
	System.out.println(result);
	System.out.println(result2);
} 
	}
   
	 class MyMath{
//		 形参顺序不同，构成重载
	public double add(double a,int b){
		return (double)(a+b);	}
	
	public int add(int a,double b){
		return (int)(a+b);
	}
//	形参个数不同，构方法的重载
	public double add(int a,double b,double c){
		return (double)(a+b+c);
	}

	}
