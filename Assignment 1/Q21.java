class Q21 {
    public static void main(String[] args) {
        double brickVol = (15.0 / 100) * (8.0 / 100) * (5.0 / 100);
        double wallVol = 15 * 10 * 8;
        int bricks = (int)(wallVol / brickVol);
        System.out.println("Number of bricks needed: " + bricks);
    }
}
