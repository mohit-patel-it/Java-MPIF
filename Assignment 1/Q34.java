class Q34 {
    public static void main(String[] args) {
        int base1 = 128, base2 = 92, height = 40, walkwayWidth = 4;
        double trapArea = 0.5 * (base1 + base2) * height;
        int walkwayArea = walkwayWidth * height;
        double totalArea = trapArea + walkwayArea;
        System.out.println("Total area after walkway: " + totalArea + " m\u00B2");
    }
}
