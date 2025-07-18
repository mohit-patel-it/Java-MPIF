public class Q13 {
  /*The area of a right triangle is 184 cm² and one
   of its legs is 16 cm long. Find the length of other leg.*/
    public static void main(String[] args) {
        double area = 184;
        double leg1 = 16;
        double leg2 = (2 * area) / leg1;
        System.out.printf("The other leg of the triangle: %.2f cm\n", leg2);
    }
}
