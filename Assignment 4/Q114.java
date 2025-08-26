class Q114 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int s = 1; s <= i; s++) {
                System.out.print(" ");
            }
            for (int j = 6 - i; j >=1; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
