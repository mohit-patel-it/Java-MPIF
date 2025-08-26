/*import java.util.Scanner;
class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms:");
        int n = sc.nextInt();
        int count=0;
        Sum=0;
        for(int i=0;i<=n;i++){
          count=count*10+1;
          //System.out.print(count+" ");
          sum=sum+count;
        }
        System.out.println(count);
        
    }
}*/
import java.util.Scanner;
class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int count = 0;
        int sum = 0;

        System.out.print("Series: ");
        for (int i = 1; i <= n; i++) {
            count = count * 10 + 1;
            sum =sum+count;
            System.out.print(count);
            if (i < n){
               System.out.print(" + ");
            }
        }

        System.out.println("\nSum of the series = " + sum);
    }
}

