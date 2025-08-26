//7. WAP to search an element in array using binary search.
import java.util.Scanner;
class Q7{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Size : ");
    int size=sc.nextInt();
    int arr[]=new int[size];
    for(int i=0;i<size;i++){
      System.out.println("enter elements"+(i+1)+":");
      arr[i]=sc.nextInt();
    }
    //print values of array
    System.out.print("Unsorted Array: ");
    for(int x:arr){
      System.out.print(x+" ");
    }
    //bubble sort Start
     for(int j=0;j<size-1;j++){
      //System.out.println("Pass"+(j+1+":"));
     for(int i=0;i<size-1-j;i++){
      if(arr[i]>arr[i+1]){
        int temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
      }
    }
    }
    System.out.print("\nFinal Sorted array Before Binary Search: ");
    for(int  x: arr){
      System.out.print(x+" ");
    }
    //this is ending part of Bubble sort

    //input of searching element
     System.out.print("\nEnter element to search: ");
     int key = sc.nextInt();
     
     int start = 0;
     int end = size - 1;
//Binary Searching 
for (; start <= end;) {

   int mid = (start + end) / 2;

   if (arr[mid] == key) {
    System.out.println("Element found at index: " + mid);
    break;
   }
   else if (key < arr[mid]) {
    end = mid - 1;
   }
   else {
    start = mid + 1;
   }
   }
 if (start > end) {
   System.out.println("Element not found.");
 }
 // this part for binary searching 

  }
}