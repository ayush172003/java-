import java.util.Scanner;

public class Fun1 {
    //  public static int print()
    //  {
    //     System.out.println("hiiii");
    //     return 1;
    //  }
    public static void sum(int num1,int num2) {
        
        int sum=num1+num2;
         System.out.println(sum);
        //  return sum;
    }
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b =sc.nextInt();
         sum(a,b);
       
        
     }
}
