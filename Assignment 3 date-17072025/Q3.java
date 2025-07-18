import java.util.Scanner;
class Q3{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
      System.out.print("Enter the how many years of experience do you have:");
      int exp=sc.nextInt();
      System.out.println();
      System.out.print("How much Your salary:");
      int salary=sc.nextInt();
      System.out.println();
      if(exp>5){
        int bonus=(salary*5)/100;
        System.out.println("Bonus is:"+bonus);
      }
      else if(exp<5){
        System.out.println("Years of experience is low");
      }
      
        System.out.println("thank you So much");
      
}
}