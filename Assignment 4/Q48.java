import java.util.Scanner;

class Q48 {
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
      System.out.print("Factors of " + num + " are: ");
      
      int i = 1;
      while (i <= num) {
        if (num % i == 0) {
          System.out.print(i + " ");
        }
        i++;
      }

      System.out.println();
      num++;
    }
  }
}
/*
import java.util.Scanner;

class Q48 {
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
    for (int num = a; num <= b; num++) {
      System.out.print("Factors of " + num + " are: ");
      for (int i = 1; i <= num; i++) {
        if (num % i == 0) {
          System.out.print(i + " ");
        }
      }
      System.out.println(); 
    }
  }
}
*/
