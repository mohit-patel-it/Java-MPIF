// 2. WAP to program to calculate the sum of all element of array.
import java.util.Scanner;
class Q2{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of array please:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    int sum=0;
    for(int i=0;i<n;i++){
      System.out.println("Enter element"+(i+1)+"of");
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
      sum=sum+arr[i];
    }
      System.out.println("sum of all data: "+sum);

  }
}