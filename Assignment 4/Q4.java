import java.util.Scanner;
class Q4{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to print a table: ");
    int num=sc.nextInt();
    int fact=1;
    
    for(int i=1;i<=10;i++){
      fact=num*i;
      System.out.println(fact);
    }
    
  }
}