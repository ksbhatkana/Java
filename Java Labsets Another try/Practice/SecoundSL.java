public class SecoundSL
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		a[0]=10;
		a[1]=22;
		a[2]=04;
		a[3]=25;
		a[4]=38;
		int min=a[0],mi=0,max=0,ma=0;
		for(int i=0;i<5;i++)
		{
			if(min>a[i])
				mi=i;
			if(max<a[i])
				ma=i;
		}
		a[ma]=0;
		a[mi]=0;
		min=a[0];
		max=0;
		for(int i=0;i<5;i++)
		{
			if(min>a[i] && a[i]!=0)
				min=a[i];
			if(max<a[i])
				max=a[i];
		}
		System.out.println("Secound Smallest Number :"+min);
		System.out.println("Secound Largest Number :"+max);
	}

}
