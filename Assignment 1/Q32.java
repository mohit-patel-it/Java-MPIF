class Q32 {
    public static void main(String[] args) {
        int gardenSide = 150;
        int poolSide = 25;
        int totalArea = gardenSide * gardenSide;
        int poolArea = poolSide * poolSide;
        int usable = totalArea - poolArea;
        System.out.println("Usable area of garden: " + usable + " sq.m");
    }
}
