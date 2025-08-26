import java.util.Scanner;

class Q36 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number to check palindrome: ");
    int n = sc.nextInt();
    int original = n; 
    int rev = 0;


    int sign = 1;
    if(n < 0) {
      sign = -1;
      n = -n;
    }
    
    for (; n > 0; n = n / 10) {
      int digit = n % 10;
      rev = rev * 10 + digit;
    }
    rev = rev * sign;  
    System.out.print(rev);

  }
}
