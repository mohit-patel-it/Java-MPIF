import java.util.Scanner;
class Q5{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Costs:");
    int cost=sc.nextInt();
    System.out.println("length:");
    int length=sc.nextInt();
    System.out.println("rate of per meter:");
    int ratepermeter=sc.nextInt();
    int perimeter=cost/ratepermeter;
    System.out.println("Perimeter is :"+perimeter);
    int breadth=(perimeter/2)-length;
    System.out.println("Breadth:"+breadth);
    int area=length*breadth;
    System.out.println("area of the field:"+area);
  }
}