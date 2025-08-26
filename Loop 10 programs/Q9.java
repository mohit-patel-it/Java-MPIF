import java.util.Scanner;
class Q9{
  public static void main(String []args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number :");
    int num=sc.nextInt();
    double sum=0;
    for(int i=1;i<=num;i++){
      sum=sum+(1.0/i);
    }
    System.out.println("Sum is :"+sum);
  }
}