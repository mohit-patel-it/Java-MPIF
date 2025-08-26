// 1. WAP to Enter n element in array and print array
import java.util.Scanner;
class Q1{
  public static void main(String []args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter size of array:");
    int n=sc.nextInt();//taken a size of array
    int arr[]=new int[n];//declaration of array 
    for(int i=0;i<n;i++){
      System.out.println("Enter elements "+(i+1)+"of :");
      arr[i]=sc.nextInt();// store the values of places 
    }
    System.out.println("Given data:");
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");//print the values index 
    }
  }
}