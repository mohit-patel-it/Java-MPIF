class Q23 {
    public static void main(String[] args) {
        int side = 3;
        int boxVol = side * side * side;
        int cartonVol = 15 * 9 * 12;
        int boxes = cartonVol / boxVol;
        System.out.println("Number of boxes that can fit: " + boxes);
    }
}
