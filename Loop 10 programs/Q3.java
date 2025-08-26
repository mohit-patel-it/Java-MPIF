import java.util.Scanner;
class Q3{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter range of n number you want to Square");
    int num=sc.nextInt();
    //int sqr=1;
    for(int i=1;i<=num;i++){
      System.out.print((i*i)+" ");
    }
  }
}