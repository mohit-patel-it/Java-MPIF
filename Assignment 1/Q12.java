public class Q12 {
  /*
   12. Find the area of a right angled triangle whose hypotenuse is 13 cm and 
   one of its sides containing the right angle is 12 cm. Find the length of the other side.
  */
    public static void main(String[] args) {
        double hypotenuse = 13;
        double side1 = 12;
        double side2 = Math.sqrt(hypotenuse * hypotenuse - side1 * side1);
        double area = 0.5 * side1 * side2;
        System.out.printf("Other side: %.2f cm\n", side2);
        System.out.printf("Area of the triangle: %.2f cm\u00B2\n", area);
    }
}