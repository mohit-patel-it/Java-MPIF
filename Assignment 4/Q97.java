class Q97 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { 
            char ch=(char)(65);
            for (int j=5; j>=i;j--) 
            { if(j==5||i==1||i==j)
                System.out.print(ch);
                else
                System.out.print(" ");
                ch++;
            }
            System.out.println();
        }
    }
}
