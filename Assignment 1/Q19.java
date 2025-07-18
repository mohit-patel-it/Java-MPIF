class Q19 {
    public static void main(String[] args) {
        int cubeVol = 7 * 7 * 7;
        int cuboidVol = 7 * 4 * 8;
        if (cubeVol > cuboidVol) {
            System.out.println("Cube has more volume: " + cubeVol + " cm³");
        } else {
            System.out.println("Cuboid has more volume: " + cuboidVol + " cm³");
        }
    }
}
