class Q15 {
    public static void main(String[] args) {
        int rect_area = 22 * 15;
        int square_area = 21 * 21;
        if (rect_area > square_area) {
            System.out.println("Shelly's garden is bigger by " + (rect_area - square_area) + " sq.m");
        } else {
            System.out.println("Rachel's garden is bigger by " + (square_area - rect_area) + " square meter");
        }
    }
}
