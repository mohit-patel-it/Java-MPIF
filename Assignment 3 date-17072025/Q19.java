import java.util.Scanner;
class Q19
 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First value:");
        int a=sc.nextInt();
        System.out.println("Enter Second value:");
        int b=sc.nextInt();
        
        System.out.println("Before Swap: a = " + a + ", b = " + b);

        a = a + b; 
        b = a - b; 
        a = a - b; 

        System.out.println("After Swap (without 3rd variable): a = " + a + ", b = " + b);
    }
}
/*class SwapWithTemp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First value:");
        int a=sc.nextInt();
        System.out.println("Enter Second value:");
        int b=sc.nextInt();

        System.out.println("Before Swap: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap (with 3rd variable): a = " + a + ", b = " + b);
    }
}
*/