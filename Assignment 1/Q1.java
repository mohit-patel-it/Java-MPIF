class Q1{
  public static void main(String []args){
    /*
    1.	 The perimeter of a rectangle is 230 cm. If the length of 
    the rectangle is 70 cm, find its breadth and area.
    */
   /*
    Perimeter=2×(Length+Breadth)
    Breadth=(perimeter/2)-length
   */

   int perimeter=230;
   int length=70;
   int breadth, area;
   breadth=(perimeter/2)-length;
   System.out.println("Breadth of Perimeter : "+breadth+"cm");
    area= length*breadth;
    System.out.println("Area of Perimeter : "+ area+ " square cm ");
  }
}