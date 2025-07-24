import java.util.Scanner;
class Q3{
  public static void main(String []args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter n natural Number :");
    int num=sc.nextInt();
    int sum=0;
    if(num>0){
      for(int i=0;i<=num;i++){
        sum=sum+i;
      }
      System.out.println("Sum is :"+sum);
    }
    else if(num<=0){
      System.out.println("Enter Number is invalid");
    }

  }
}