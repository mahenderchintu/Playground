import java.util.Scanner;
class Main{
  static Scanner sc=new Scanner(System.in);
    static int n=sc.nextInt();
  public static int sum(int n)
  {
    
    int summ=0;
    for(int i=1;i<=n;i++)
    {
      summ=summ+i;
    }
    
    return summ;
  }
  
	public static void main (String[] args){
	    // Type your code here
      Main ob=new Main();
      int c=ob.sum(n);
      System.out.println(c);
	}
}