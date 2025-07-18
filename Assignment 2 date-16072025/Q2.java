import java.util.Scanner;
public class Q2{
  /*
  2. The area of a rectangle is 96 cm².
   If the breadth of the rectangle is 8 cm, 
   find its length and perimeter. 
  */
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter area: ");
    int area=sc.nextInt();
    System.out.println("Enter breadth: ");
    int breadth=sc.nextInt();
    int length=area/breadth;
    System.out.println("length is :"+length);
    int perimeter=2*(length+breadth);
    System.out.println("Perimeter is:"+perimeter);
    
  }
}