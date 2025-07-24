import java.util.Scanner;
class Q5{
  public static void main(String []args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter num");
    int n=sc.nextInt();
    if(n>0){
    for(int i=1;i<=n;i++){
      if(n%i==0){
        System.out.println("Factors is:"+i);
      }
    }
    }
    else if(n<=0){
      System.out.println("Enter number is wrong");
    }
  }
}