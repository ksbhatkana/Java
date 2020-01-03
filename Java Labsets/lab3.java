 class A
{
	static int a;
	static int b=3;
	static void method(int a,int b)
	{
	        //static int b=3;
		System.out.println("a="+a+"b="+b);
		//b=6;
	}
	static
	{
		b=b*3;
		System.out.println("static block initialised and b="+b);
	}
	class B
	{
	   int x;

	}
	static class C
	{
		int y;
	}

}
public class lab3
{
	public static void main(String args[])
	{
		A.method(5,6);
		//b=6;
		A ob1 =new A();
		A.B ob2=ob1.new B();
		A.C ob3=new A.X();
		ob2.x=5;
		ob3.y=6;
		System.out.println("value of variable x in inner class is"+ob2.x);
		System.out.println("value of variable x in inner class is"+ob3.y);
		//System.out.println("value of variable x in inner class is"+n.x);

	}
}


