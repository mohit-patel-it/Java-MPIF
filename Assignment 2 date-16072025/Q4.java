import java.util.Scanner;
class Q4{
  public static void main (String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Plot Land Length:");
    int plotlandLength=sc.nextInt();
    System.out.println("Plot Land Breadth:");
    int plotbreadth=sc.nextInt();
    System.out.println("Enter Cost of per meter:$");
    int cost=sc.nextInt();
    int area=plotlandLength*plotbreadth;
    int Totalcost=(area*cost)/100;
    System.out.println("Total Cost :$"+Totalcost);

  }
}