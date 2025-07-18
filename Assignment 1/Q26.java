class Q26 {
    public static void main(String[] args) {
        double pathArea = 120 * 2.4;
        double brickArea = (24.0 * 15.0) / 10000;
        int bricks = (int)Math.ceil(pathArea / brickArea);
        System.out.println("Bricks needed: " + bricks);
    }
}
