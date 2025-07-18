import java.util.Scanner;
class Q6{
  public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
      System.out.println("Side1:");
      int side1=sc.nextInt();
      System.out.println("Side2:");
      int side2=sc.nextInt();
      System.out.println("perimeter:");
      int perimeter=sc.nextInt();       
      int side3=perimeter-(side1+side2);
      int s=perimeter/2;
    
      double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
      System.out.println(area+"cm\u00B2");
      
  }
}