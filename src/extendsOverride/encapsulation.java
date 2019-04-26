package extendsOverride;
// 测试封装
// private  同一个类  可见  ,【属性一般用私有】
//  default  同一个类，  一个包
//    protected  同一个类，同一个包， 子类
//      public   所有类
public class encapsulation
{    private String name;
       private String id;
            private String age;
            public static int cc=120;
            public static final int Max_SPEED=120;
			public String getName()
			{
				return name;
			}
			public void setName(String name)
			{
				this.name = name;
			}
			public String getId()
			{
				return id;
			}
			public void setId(String id)
			{
				this.id = id;
			}
			public String getAge()
			{
				return age;
			}
			public void setAge(String age)
			{
				this.age = age;
			}
//      添加setname()，getname()的方法,快捷键右击 source+Getter and
//      Setter
            
            

}
