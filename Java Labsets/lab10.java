 public class lab10
 {
   public static void main(String[] args)
    {
        int A[];
        A = new int[] {1, 2, 3, 4, 5};
      try {

           System.out.println(sum(A) );
          }
       catch (Exception ex)
       {
         ex.printStackTrace();
         System.out.println("\n" + ex.getMessage());
         System.out.println("\n" + ex.toString());
	System.out.println("\nTrace Info Obtained from getStackTrace");
	StackTraceElement[] traceElements = ex.getStackTrace();
	   for (int i = 0; i < traceElements.length; i++)
	   {
                   System.out.print("method " + traceElements[i].getMethodName());
                   System.out.print("(" + traceElements[i].getClassName() + ":");
                   System.out.println(traceElements[i].getLineNumber() + ")");

           }
        }
   }
private static int sum(int[] list)
  {
     int result = 0;
     int n=list.length;
        int r = For(n,result,list);
      return result;

  }

private static int For(int n,int r,int[] list)
{
  for (int i = 0; i <= n; i++)
           r += list[i];
      return r;
}
}

