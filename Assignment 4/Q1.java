import java.util.Scanner;
class Q1{
  public static void main(String []args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter String to print a 1000 times:");
    String Statement=sc.nextLine();
    for(int i=0;i<=1000;i++){
      System.out.println(Statement+"\n");
    }

  }
}