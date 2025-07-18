import java.util.Scanner;

class Q44 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter first number: ");
      int a = sc.nextInt();
      System.out.print("Enter second number: ");
      int b = sc.nextInt();
      System.out.print("Enter your choice (+, >, ==): ");
      String choice = sc.next();
      switch (choice) {
     case "+":
         System.out.println("Addition = " + (a + b));
         break;
     case ">":
         System.out.println("Greater number is " + (a > b ? a : b));
         break;
     case "==":
         System.out.println(a == b ? "Numbers are equal" : "Numbers are not equal");
         break;
     default:
         System.out.println("Invalid choice");
        }
    }
}
