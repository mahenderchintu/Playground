import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int fact=1;
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
      {
        fact=fact*i;
      }
     System.out.println(fact);
	}
}