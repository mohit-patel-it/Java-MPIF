import java.util.Scanner;
class Q6{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number to find a factors:");
    int num=sc.nextInt();
    System.out.println("Factors of " + num + " are:");
    for(int i=1;i<=num;i++){
      if(num%i==0){
        System.out.println(i+" ");
      }

    } 
  }
}