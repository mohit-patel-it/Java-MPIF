import java.util.Scanner;
class Q12{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter four digit number");
    int num=sc.nextInt();
    if (num >= 1000 && num <= 9999) {
      int d1 = num % 10;         
      int d2 = (num / 10) % 10;
      int d3 = (num / 100) % 10;
      int d4 = num / 1000;  

      int reversed = d1 * 1000 + d2 * 100 + d3 * 10 + d4;
      System.out.println("Reversed number: " + reversed);
      } else {
            System.out.println("Please enter a valid 4-digit number.");
        }
  }
}