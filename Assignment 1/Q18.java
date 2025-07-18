class Q18 {
    public static void main(String[] args) {
        int length = 50, breadth = 30;
        int perimeter = 2 * (length + breadth);
        int rounds = 10;
        double total = perimeter * rounds / 1000.0;
        System.out.println("Distance jogged in a day: " + total + " km");
    }
}
