import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
       Scanner in = new Scanner(System.in);
       int size = in.nextInt();
       int arr[] = new int[size];
       for(int index = 0; index <= size - 1; index++){
           arr[index] = in.nextInt();
       }
       int value = in.nextInt();
      
       pairs(size, arr, value);
    }
    
    public static void pairs(int size, int arr[], int value)
    {
        for(int i = 0; i <= size - 1; i++)
        {
            for(int j = i + 1; j <= size - 1; j++)
            {
                int sum = arr[i] + arr[j];
                if(sum == value)
                {
                    System.out.println(arr[i] + "," + " " + arr[j]);
                }
            }
        }
    }
}