import java.util.Scanner;
class Q10{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number how many even number:");
    int num=sc.nextInt();
    int count=0;
    for(int i=0;i<=num;i++){
      if(i%2==0){
        System.out.println(i);

      }
    }
  }
}