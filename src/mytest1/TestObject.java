package mytest1;
//测试Object类, toString()方法  ：return getClass().getName()+@+
//Integer,toHexString(hashcode())
public class TestObject
{   public static void main(String[] args) {
	Object obj=new Object();
	System.out.println(obj.toString());
	Object obj2=new Object();
	System.out.println(obj2.toString());
	System.out.println(obj==obj2);
//	equals 方法判断两个字符串是否相等
	System.out.println(obj.equals(obj2));
}

}
