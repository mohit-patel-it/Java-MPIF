public class Q8 {
  public static void main(String[] args) {
        double areaInSquarMeters = 0.8;
        double areaInCm2 = areaInSquarMeters * 10000;
        double height = 20;
        double base = (2 * areaInCm2) / height;
        System.out.printf("Base of the triangle: %.2f cm\n", base);
    }
}
