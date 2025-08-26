//9. WAP to delete element from array at specific position.
import java.util.Scanner;

class Q9{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter size of array: ");
    int size = sc.nextInt();
    int arr[] = new int[size];

    System.out.println("Enter " + size + " elements:");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.print("Enter position to delete : ");
    int pos = sc.nextInt();

    if (pos < 1 || pos > size) {
      System.out.println("position not found");
      return;
    }

    int newArr[] = new int[size - 1];
    for (int i = 0, j = 0; i < size; i++) {
      if (i != pos - 1) {
        newArr[j++] = arr[i];
      }
    }

    System.out.print("Array after deletion: ");
    for (int x : newArr) {
      System.out.print(x + " ");
    }
  }
}
