// 3. WAP to program calaculate the sum of all even element and all odd element of array
import java.util.Scanner;
class Q3{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size: ");
    int n=sc.nextInt();
    //convert negative to positive 
    if(n<0){
      System.out.println("Enter size is negative"+n+" Array dont work on negative data: ");
      int sign=n*-1;
      n=sign;
    }

    int arr[]=new int[n];
    int Evensum=0,Oddsum=0;
    for(int i=0;i<n;i++){
      System.out.println("Enter value"+(i+1)+"of:");
      arr[i]=sc.nextInt();
    }
    for(int i=1;i<arr.length;i++){
      if(arr[i]%2==0){
        Evensum=Evensum+arr[i];
      }
      else{
        Oddsum=Oddsum+arr[i];
      }

    }
    System.out.println("Sum of even numbers"+Evensum);
    System.out.println("Sum of even numbers"+Oddsum);
  }
}