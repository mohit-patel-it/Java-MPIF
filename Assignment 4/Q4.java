import java.util.Scanner;
class Q4{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Factorial number :");
    int n=sc.nextInt();
    int fact=1;
    if(n>=1){
    for(int i=1;i<=n;i++){
      fact=fact*i;
    }
    System.out.println("Factorial is :"+fact);
    }
    else if(n<=0){
      System.out.println("Enter number is wrong");
    }
  }
}