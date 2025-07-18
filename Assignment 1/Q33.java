class Q33 {
    public static void main(String[] args) {
        int totalArea = 30 * 20;
        int path1 = 3 * 30;
        int path2 = 4 * 20;
        int overlap = 3 * 4;
        int usable = totalArea - (path1 + path2 - overlap);
        System.out.println("Usable area of garden: " + usable + " m\u00B2");
    }
}
