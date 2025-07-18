class Q38 {
    public static void main(String[] args) {
        double volume = 1287;
        double r = 10;
        double h = volume / (Math.PI * r * r);
        double sa = 2 * Math.PI * r * (r + h);
        System.out.printf("Surface area: %.2f cm\u00B2", sa);
    }
}
