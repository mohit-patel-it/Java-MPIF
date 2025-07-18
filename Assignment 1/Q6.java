class Q6{
    public static void main(String[] args) {
        double a = 10, b = 9, c = 17;
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        // console supports Unicode characters or not in different versions \u00B2
        System.out.printf("Area of the triangle: %.2f cm\u00B2\n", area);
    }
}