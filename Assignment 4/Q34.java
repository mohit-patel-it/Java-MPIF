import java.util.Scanner;
class Q34{
  public static void main(String []args){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter number a");
    int n=sc.nextInt();

    int sum=0;
    int i=1;

    while(i<n){
      if(n%i==0){
        System.out.print(i+" ");
        sum=sum+i;
      }
      i++;
    }
    System.out.print("\n Sum is : "+sum);
    if(n==sum){
      System.out.println("\n it is a Perfect number ");
    }
    else{
      System.out.println("\nIts is not a perfect number");
    }
  }
}