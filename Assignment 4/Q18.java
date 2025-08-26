import java.util.Scanner;
class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int n1 = 1;        
        int n2= 2;   
        for (int i = 1; i <= n; i++) {
          int n3=n1*n2;
        System.out.print(n1+ " ");
        n1=n2;
        n2=n3;
        
        // if (i == 1) {
        //     term = 2;  
        // } else if (i == 2) {
        //     term = 2;  
        // } else {
        //     term = term * multiplier;
        //     multiplier=multiplier*2; 
        //     }
        }
    }
}
