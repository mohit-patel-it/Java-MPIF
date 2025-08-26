import java.util.Scanner;
class Q2{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array: ");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      System.out.println("Enter element :");
      arr[i]=sc.nextInt();
    }
    for (int elements : arr) {
      System.out.println("Store elements in Array: "+arr[n]);
    }
  }
}