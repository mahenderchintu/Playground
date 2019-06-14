import java.util.Scanner;
class Main
{
 static Scanner sc=new Scanner(System.in);
   static int n=sc.nextInt();
  public static int square(int n)
  {
    int c=n*n;
    return c;
  }
    
	public static void main (String[] args)
    {
	 // Type your code here  Sx\
      
      Main ob=new Main();
      
      int sq=ob.square(n);
      System.out.println(sq);
    
	} 
}