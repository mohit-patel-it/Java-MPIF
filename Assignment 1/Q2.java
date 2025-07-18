class Q2{
     /*
     2.The area of a rectangle is 96 cm². If the breadth of 
     the rectangle is 8 cm, find its length and perimeter. 
     */
     public static void main(String []args){
     int area = 96;
     int breadth = 8;
     int length , perimeter;
     length=area/breadth;
     System.out.println("Length of Rectangle: "+ length+"cm");
     perimeter=2*(length+breadth);
     System.out.println("Perimeter of rectangle : "+perimeter+"cm");
  
  }
}