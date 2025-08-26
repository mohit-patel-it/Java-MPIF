//8. WAP to insert a element in array at specific position.
import java.util.Scanner;
class Q8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();

        int arr[] = new int[n+1];
        System.out.println("Enter "+n+" element");
        for(int i=0; i<n; i++){
          arr[i] = sc.nextInt();
        }

        System.out.println("Enter position");
        int pos = sc.nextInt();
        System.out.println("Enter new element");
        int element = sc.nextInt();
        
        for(int i=n-1; i>=(pos-1); i--){
            arr[i+1] = arr[i];
        }
        arr[pos-1] = element;
        n = n + 1;
        System.out.println("After inserting element...");
        for(int i=0; i<n; i++)
          System.out.println(arr[i]);
    }
}