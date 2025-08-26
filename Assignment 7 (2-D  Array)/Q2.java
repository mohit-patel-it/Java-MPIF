import java.util.Scanner;
class Q2{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter rows of array:");
    int n=sc.nextInt();
    System.out.println("Enter colonms of array:");
    int m=sc.nextInt();
    int [][]arr=new int[n][m];
    
    for(int r=0;r<n;r++){
      for(int c=0;c<m;c++){
        System.out.println("Enter elements row"+(r+1)+"colomn"+ (c+1)+":");
        arr[r][c]=sc.nextInt();
      }
    }
    System.out.println("\nThe array is: ");
  for(int[] row:arr){
    for(int element:row){
      System.out.print(" "+element);
    }
    System.out.println();
    }
    for(int r=0;r<n;r++){
      for(int c=0;c<m;c++){
        if(r==c)
           System.out.println(arr[r][c]);
        
      }
    }
    
  }
}