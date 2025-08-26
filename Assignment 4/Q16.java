import java.util.Scanner;
class Q16{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter a number");
    int num=sc.nextInt();
    if(num<0){
      num=Math.abs(num);
    }
    
    for(int i=-num;i<=num;i++){

      System.out.print(i+" ");
      i=i+2;

    }
    
  }
}