class Q37 {
    public static void main(String[] args) {
        int sa = 149;
        int h = 6;
        float pi = 3.1416f;

        float r = (sa / (2 * pi * (h + 1))); // rough approximation
        float d = 2 * r;

        System.out.println("Diameter is approximately: " + d  + " cm");
    }
}
