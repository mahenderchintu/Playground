import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      String str=sc.nextLine();
      int n=str.length();
      int end=n-1;
      int front=0;
      boolean palindrome=true;
      while(front<end)
      {
        if(str.charAt(front)!=str.charAt(end))
        {
       palindrome = false;
          break;
        }
        front++;
        end--;
      }
        if(palindrome==true)
        {
         System.out.println("Yes");
        }
        else
        {
          System.out.println("No");
        }
      
          
     
      
    } 
}