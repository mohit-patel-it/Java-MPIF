import java.util.Scanner;
class Q8{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number for fibonacci:");
    int num=sc.nextInt();
    int num1=0,num2=1;
    
    for(int i=0;i<=num-1;i++){
      int num3=num1+num2;
      System.out.print(num1+" ");
      num1=num2;
      num2=num3;
    }
  }
}