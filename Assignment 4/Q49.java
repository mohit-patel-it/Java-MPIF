//49) WAP to find out all the perfect numbers between two entered numbers

import java.util.Scanner;

class Q49 {
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
      int sum = 0;
      int i = 1;

      while (i < num) {
        if (num % i == 0) {
          sum=sum+i;
        }
        i++;
      }

      if (sum == num && num != 0) {
        System.out.println(num + " is a Perfect Number");
      }
      else{
        System.out.print(num +" Is a not a Perfect Number\n");
      }

      num++;
    }
  }
}
