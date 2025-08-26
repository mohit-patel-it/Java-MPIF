import java.util.Scanner;
class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
          System.out.print(i*i*i+" ");
        }
        
    }
}
