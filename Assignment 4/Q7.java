import java.util.Scanner;
class Q7{
  public static void main (String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number");
    int num=sc.nextInt();
    for(int i=2;i<=num-1;i++){
      if(num%i==0){
        System.out.println(num+" Not a prime :");
        break;
      }
    else{
      System.out.println(num+" Number is prime");
      break;
     }
   }
  }
}