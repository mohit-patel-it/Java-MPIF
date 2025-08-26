class Q116 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }

            // Character printing
            for (int j = 0; j < n - i; j++) {
                // Row 0 → print full letters
                if (i == 0) {
                    System.out.print((char)(65 + j));
                }
                // Other rows → only print first and last character
                else if (j == 0 || j == n - i - 1) {
                    System.out.print((char)(65 + j));
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
