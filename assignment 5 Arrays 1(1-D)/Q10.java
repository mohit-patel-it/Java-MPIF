// 10.WAP to to count the occurance of all element in array
import java.util.Scanner;
class Q10{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter size of array: ");
    int size = sc.nextInt();
    int arr[] = new int[size];

    System.out.println("Enter " + size + " elements:");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("Element : Occurrence");

    for (int i = 0; i < size; i++) {
      int isPrinted = 0;
      for (int k = 0; k < i; k++) {
        if (arr[i] == arr[k]) {
          isPrinted = 1;
          break;
        }
      }

      if (isPrinted == 1) {
        continue; 
      }

      int count = 0;
      for (int j = 0; j < size; j++) {
        if (arr[i] == arr[j]) {
          count++;
        }
      }

      System.out.println(arr[i] + " : " + count);
    }
  }
}
