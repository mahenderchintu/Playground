import java.util.Scanner;
class Main{
 static  Scanner in = new Scanner(System.in);
	   static int base = in.nextInt();
	    static int exponent = in.nextInt();
  static int power=1;
  public static int power_of_a_number(int base, int exponent)
    {
	 
	    while(exponent >= 1)
	    {
	        power = power * base;
	        exponent--;
	    }
	    return power;
	}
      
	public static void main (String[] args)
    {
      Main ob=new Main();
     ob.power_of_a_number(base, exponent);
      System.out.println(power);
	    	    
	}
    
	
	
}