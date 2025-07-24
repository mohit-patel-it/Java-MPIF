import java.util.Scanner;
class Q2{
  public static void main(String []args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter how many natural numbers do you want print");
    int num=sc.nextInt();
    if(num<0){
      System.out.println("Number is not valid its a nagitive number");
    }
    else if(num>0){
      for(int i=0;i<=num;i++){
        System.out.println(i);
      }
    }
    else {
      System.out.println("Invalid output");
    }

  }
}