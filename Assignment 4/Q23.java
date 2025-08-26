import java.util.Scanner;
class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        for(int i=1;i<=n*2;i++){
          if(i%2==1){
          System.out.print(i*i+" ");
          }
        }
        
    }
}
