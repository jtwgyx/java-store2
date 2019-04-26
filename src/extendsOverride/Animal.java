package extendsOverride;
// 测试继承，方法的重写

public class Animal
{   String eyes;
      public void eat() {
    	  System.out.println("吃吃");
      }
        public void run() {
    	  System.out.println("跑跑");
      }
        public void sleep() {
     	  System.out.println("睡睡");
      }
      
}

//哺乳动物类，继承Animal类
class buru extends Animal {
	
	public void taisheng() {
		System.out.println("胎生");
	}
}
//  爬行动物类，继承动物类
class paxing extends Animal {
	
	public void eggsheng() {
		System.out.println("卵生");
	}
}

//  测试方法的重写，重写和重载没有 关系！！！
   class Bird extends Animal{
//	   重写了父类的[run()]方法
	   public void run() {
		   System.out.println("我是一只小小鸟，飞呀飞不高");
	   }
	   public Bird(){
		   super();
		   System.out.println("建一个动物对象");
		   
	   }
   }

   
 
//super是 直接父类对象的引用。  可以通过super来访问
//父类中被子类覆盖的方法或属性
//普通方法:没有顺序限制，可以随便调用
//  构造函数：若第一行代码没有显式的调用super();那么Java会默认的调用super()
//  所以在构造函数中加不加  【super】都无所谓
   
   
   


