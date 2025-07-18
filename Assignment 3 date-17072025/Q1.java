import java.util.Scanner;
class Q1{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter length:");
    int length=sc.nextInt();
    System.out.println("Enter Breadth:");
    int Breadth=sc.nextInt();
    if(length==Breadth)
    System.out.println("Square");
    else
    System.out.println("Not a Square");
  }

}