class Pattern {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++) {
            int stars = 1+(i-1)*i/2;
            for(int j=1; j<=stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
