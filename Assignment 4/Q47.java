//47) WAP to print tables of all the numbers between two entered numbers
import java.util.Scanner;
class Q47{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number a:");
    int a=sc.nextInt();

    System.out.println("Enter number b:");
    int b=sc.nextInt();


    int start=a;
    while(start<=b){
      int i=1;
      while(i<=10){
        System.out.print(start+"*"+i+"="+start*i+"\n");
        i++;
      }
      System.out.println();
      start++;
    }
  }
}