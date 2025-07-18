import java.util.Scanner;
public class Q1{
  public static void main(String args[]){
     /*
     1.	 The perimeter of a rectangle is 230 
     cm. If the length of the rectangle is 70 
     cm, find its breadth and area.
     */
     //formula is 
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter perimeter:= ");
     int perimeter=sc.nextInt();
     System.out.print("Enter Length:= ");
     int length=sc.nextInt();
     int breadth=(perimeter/2)-length;
     System.out.println("Breadth is :"+breadth);
     int area=breadth*length;
     System.out.println("Area is:"+area);
  }
}