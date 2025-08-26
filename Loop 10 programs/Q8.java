import java.util.Scanner;
class Q8{
  public static void main(String []args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number you find fibonacci:");
    int num=sc.nextInt();
    int num1=0,num2=1;
    for(int i=0;i<=num;i++){//0+1=1=next,first=1,second=1==>1+1=2=next//first=1,second=2//
      System.out.print(num1+" ");
      int num3=num1+num2;
        num1=num2;
        num2=num3;
    }
  }
}