//6. WAP to sort the array
import java.util.Scanner;
class Q6{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Size : ");
    int size=sc.nextInt();
    int arr[]=new int[size];
    for(int i=0;i<size;i++){
      System.out.println("enter elements"+(i+1)+":");
      arr[i]=sc.nextInt();
    }
    System.out.print("Unsorted Array: ");
    for(int x:arr){
      System.out.print(x+" ");
    }
    //bubble sort with steps
     for(int j=0;j<size-1;j++){
      //System.out.println("Pass"+(j+1+":"));
     for(int i=0;i<size-1-j;i++){
      if(arr[i]>arr[i+1]){
        int temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
      }
    }
    //for(int x:arr){
      //System.out.println(x+" ");
    //  }
    //  System.out.println();
    }
    System.out.print("\nFinal Sorted array: ");
    for(int  x: arr){
      System.out.print(x+" ");
    }
     
  }
}