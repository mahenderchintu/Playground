import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
       Scanner sc=new Scanner(System.in);
     
      int n=sc.nextInt();
      int qu=n/100;
      int re=n%10;
      int sum=qu+re;
      System.out.println(sum);
	
	}
}