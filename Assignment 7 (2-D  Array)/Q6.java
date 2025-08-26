import java.util.Scanner;
class Q6{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    // First Array
    System.out.println("Enter first array rows of array:");
    int n=sc.nextInt();
    System.out.println("Enter first array colonms of array:");
    int m=sc.nextInt();
    int [][]arr=new int[n][m];
    
    for(int r=0;r<n;r++){
      for(int c=0;c<m;c++){
        System.out.println("Enter elements row"+(r+1)+"colomn"+ (c+1)+":");
        arr[r][c]=sc.nextInt();
      }
    }
   

    // Second Array 
    System.out.println("Enter second array rows of array:");
    int n1=sc.nextInt();
    System.out.println("Enter second array colonms of array:");
    int m1=sc.nextInt();
     int [][]arr1=new int[n1][m1];
    for(int r1=0;r1<n1;r1++){
      for(int c1=0;c1<m1;c1++){
        System.out.println("Enter elements row"+(r1+1)+"colomn"+ (c1+1)+":");
        arr1[r1][c1]=sc.nextInt();
      }
    }
    //First 
     System.out.println("\nThe first array is: ");
  for(int[] row:arr){
    for(int element:row){
      System.out.print(" "+element);
    }
    System.out.println();
    }
    //Second
    System.out.println("\nThe Second array is: ");
  for(int[] row1:arr1){
    for(int element1:row1){
      System.out.print(" "+element1);
    }
    System.out.println();
    }

    // Matrix Addition
    if(n == n1 && m == m1){   //Same size check
      int [][]sum = new int[n][m];
      for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
          sum[i][j] = arr[i][j] + arr1[i][j];
        }
      }

      // Print Result
      System.out.println("\nThe Sum of the two matrices is: ");
      for(int[] rowSum : sum){
        for(int elementSum : rowSum){
          System.out.print(" " + elementSum);
        }
        System.out.println();
      }

    } else {
      System.out.println("\nMatrix addition not possible! Both matrices must have the same size.");
    }
  }
}