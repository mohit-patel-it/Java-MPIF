import java.util.Scanner;
class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
         if(i%5==0){
          System.out.print("Hello ");
          continue;
         }
          System.out.print(i+" ");
         
        }
        
    }
}
