class Q24 {
    public static void main(String[] args) {
        double brickVol = (25.0 / 100) * (10.0 / 100) * (7.5 / 100);
        double wallVol = 20 * 2 * 0.75;
        int bricks = (int)Math.ceil(wallVol / brickVol);
        int cost = (int)Math.ceil(bricks / 1000.0) * 900;
        System.out.println("Bricks needed: " + bricks);
        System.out.println("Total cost: $" + cost);
    }
}
