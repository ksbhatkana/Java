class Rectangle
{
	int l,b;
	void area()
	{
		System.out.println("Area Of rectangle "+(l*b));
        }
}

 class areaRectangle
{
	public static void main(String args[])
	{   
		Rectangle r=new Rectangle();
		r.l=20;
		r.b=40;
		r.area();		
	}
}
