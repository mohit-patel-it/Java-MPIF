import java.util.Scanner;
class Q11{
  public static void main(String []args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number to print odd numbers:");
    int num=sc.nextInt();

    for(int i=0;i<=num;i++){
      if(i%2==1){
        System.out.print(i+" ");
      }

    }
  }
}