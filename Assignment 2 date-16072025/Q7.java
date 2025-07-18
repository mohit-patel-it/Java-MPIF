import java.util.Scanner;
class Q7{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
      System.out.println("Area:=");
      int area=sc.nextInt();
      System.out.println("Base");
      int base=sc.nextInt();
      int height=(2*area)/base;
      System.out.println("height:"+height);
}
}