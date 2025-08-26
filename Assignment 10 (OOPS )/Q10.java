import java.util.Scanner;

class RectangleAreaCalculator{
  private double length;
  private double width;

  public void setvalue(double length, double width){
    this.length=length;
    this.width=width;
  }
   public double calculateArea() {
        return length * width;
    }

   public void details() {
        System.out.println("Length: " + length);
        System.out.println("Width : " + width);
        System.out.println("Area  : " + calculateArea());
    }

}
class RectangleMain{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      RectangleAreaCalculator rectangle=new RectangleAreaCalculator();
      System.out.println("Enter Length : ");
      double l=sc.nextDouble();
      System.out.println("Enter width : ");
      double w=sc.nextDouble();
      rectangle.setvalue(l, w);
      rectangle.details();
    }
}