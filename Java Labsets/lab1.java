 import java.util.Scanner;
import java.util.Collections;
class Rectangle
{
	double length;
	double width;
	double area;
	String colour;
	void set_length(double a)
	{
		length=a;
	}
	void set_width(double a)
	{
		width=a;
	}
	void set_colour(String a)
	{
		colour=a;
	}
	double find_area()
	{
		area=length*width;
		return(area);
	}
}
public class lab1
{
	public static void main(String[]args)
	{
		Rectangle ob1=new Rectangle();
		Rectangle ob2=new Rectangle();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the length of the first rectangle:");
		double a1=s.nextDouble();
		System.out.println("enter the width of the first rectangle:");
		double b1=s.nextDouble();
		System.out.println("enter the colour of the first rectangle:");
		String c1=s.next();
		ob1.set_length(a1);
		ob1.set_width(b1);
		ob1.set_colour(c1);
		System.out.println("enter the length of the second rectangle:");
		double a2=s.nextDouble();
		System.out.println("enter the width of the second rectangle:");
		double b2=s.nextDouble();
		System.out.println("enter the colour of the second rectangle:");
		String c2=s.next();
		ob2.set_length(a2);
		ob2.set_width(b2);
		ob2.set_colour(c2);
		System.out.println("First rectangle\nlength:"+ob1.length+"\nwidth:"+ob1.width+"\ncolour:"+ob1.colour+"\narea="+ob1.find_area());
		System.out.println("Second rectangle\nlength:"+ob2.length+"\nwidth:"+ob2.width+"\ncolour:"+ob2.colour+"\narea="+ob2.find_area());
		if((ob1.find_area()==ob2.find_area())&&(ob1.colour.equalsIgnoreCase(ob2.colour)))
		{
			if(ob1.length==ob2.length && ob1.width==ob2.width)
				System.out.println("matching rectangles with respect to both colour and dimensions");
			else
				System.out.println("matching rectangles with respect to only colour and area but not with dimensions");
		}
		else
		{
			System.out.println("non matching rectangles");
		}
	}
}



