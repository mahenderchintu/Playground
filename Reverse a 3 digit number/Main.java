import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int f=n/100;
    int sc=((n/10)%10);
    int l=n%10;
    System.out.println(l*100+sc*10+f);
  }
}