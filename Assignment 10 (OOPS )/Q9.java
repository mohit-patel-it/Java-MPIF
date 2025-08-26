import java.util.Scanner;

class CircleGeometry {
  private double radius;
  public void setvalue(double radius){
    this.radius=radius;
  }
  public double area(double radius){
        return (3.141)*radius*radius;
    
  }
  public double circum(double radius){
        return 2*3.141*radius;
  
  }
  public void details(){
    System.out.println("Area of circle: "+area(radius));
    System.out.println("Circum of circle: "+circum(radius));
  }
}
class circleMain{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    CircleGeometry circle=new CircleGeometry();
    System.out.println("Enter radius : ");
    double radius=sc.nextDouble();
    circle.setvalue(radius);
    circle.details();
  }
}