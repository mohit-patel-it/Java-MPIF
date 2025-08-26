// 5. WAP to replace all element with 0 which is multiple of 5
import java.util.Scanner;
class Q5{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of array please:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      System.out.println("Enter element"+(i+1)+"of");
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++){
      if(arr[i]%5==0){
        int num=0;
        arr[i]=num;
        System.out.println(arr[i]);
      }
      else {
        System.out.println(arr[i]);
      }
      
    }
  }
}