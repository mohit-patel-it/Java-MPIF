//51) WAP to reverse all the numbers between two entered numbers
import java.util.Scanner;
class Q51{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number a: ");
    int a = sc.nextInt();

    System.out.print("Enter number b: ");
    int b = sc.nextInt();
    
    if (a > b) {
      int temp = a;
      a = b;
      b = temp;
    }

    int num = a;

    while (num <= b) {
      int original = num;
      int reversed = 0;
      int temp = num;

      while (temp > 0) {
        int digit = temp % 10;
        reversed = reversed * 10 + digit;
        temp = temp / 10;
      }

      System.out.println("Reverse of " + original + " is: " + reversed);

      num++;
    }
  }
}
