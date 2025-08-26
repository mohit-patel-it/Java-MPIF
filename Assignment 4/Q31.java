import java.util.Scanner;
class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = sc.nextInt();
        int count=0;
        for(int i=0;i<=n;i++){
          count=count*10+9;
          System.out.print(count+" ");
        }
        
    }
}