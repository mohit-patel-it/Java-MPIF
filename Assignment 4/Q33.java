import java.util.Scanner;
class Q33{
  public static void main(String []args){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter a charactter");
    char n=sc.next().charAt(0);

    for(char ch='z';ch>=n; ch--){
        System.out.print("\n"+ch +" ");
    }
  }
}