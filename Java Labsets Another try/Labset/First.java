import java.util.Scanner;
import java.lang.String;

class Rectangle
{
	double width,length,area;
	String color;
	void set_length(double len)
	{
		length=len;
	}
	void set_width(double wid)
	{
		width=wid;
	}
	void set_color(String col)
	{
		color=col;
	}
	void find_area()
	{
		area=length*width;
	}
}

class First
{
	public static void main(String args[])
	{
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		Scanner  in = new Scanner(System.in);
		double wid,len;
		String col;
		System.out.println("Enter Width & Lenght of the 1st Rectangle :\n");
		wid=in.nextDouble();
		len=in.nextDouble();
		r1.set_length(len);
		r1.set_width(wid);
		r1.find_area();
		System.out.println("Enter Color of the 1st Rectangle :");
		col=in.next();
		r1.set_color(col);
		System.out.println("Area : "+r1.area);
		System.out.println("Color : "+r1.color);	
		System.out.println("Enter Width & Lenght of the 2nd Rectangle :\n");
		wid=in.nextDouble();
		len=in.nextDouble();
		r2.set_length(len);
		r2.set_width(wid);
		r2.find_area();
		System.out.println("Enter Color of the 2nd Rectangle :");
		col=in.next();
		r2.set_color(col);
		System.out.println("Area : "+r2.area);
		System.out.println("Color : "+r2.color);
		if(r1.area==r2.area && r1.color.equals(r2.color))
		{
			System.out.println("Matching Rectangle");		
		}else
		{
			System.out.println("Non Matching Rectangle");
		}
	}
	

}
