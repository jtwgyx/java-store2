package mytest1;
//构造方法
//         结构: 【修饰符】  类名【形参列表】{
//                 	n条语句
//                       }




//    1.利用 new 进行调用
//     2.构造器里虽然有返回值，但不能定义返回值类型返回值类型(返回值肯定是本类)，构造器里不能用return
//       3.如果没有构造构造器，系统会自定义一个【无参】的构造函数，如果已定义，则不添加。
//       4. 【构造器方法名必须与类名一致】
//          5. 构造该类的对象，经常也用来初始化对象的属性











public class Constructor
{  double x,y,z;


       public Constructor(double _x,double _y,double _z) {
    	   x=_x;
    	   y=_y;
    	   z=_z;
       }
 
//       提供可以设置3个坐标的方法
       public void setx(double _x){
    	   x=_x;
       }
       public void sety(double _y){
    	   y=_y;
       }
       public void setz(double _z){
    	   z=_z;
       }
        
//       构造计算距离的方法，形参为传入的点
       
       public double distance(Constructor p){
    	return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y)+(z-p.z)*(z-p.z));
       }
       
       
       public static void main(String[]args) {
    	   Constructor p=new Constructor(3,4,8);
    	   Constructor p2=new Constructor(50,-10,30);
    	     p.setx(10);
    	   System.out.println(p.x);
    	   System.out.println(p.distance(p2));
       }
}
