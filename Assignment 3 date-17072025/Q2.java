import java.util.Scanner;
class Q2{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Quantity:");
    int Quantity=sc.nextInt();
    int TotalCost=Quantity*100;
    if(TotalCost>1000){
       int Discount=TotalCost/10;
       int Afterdiscount=TotalCost-Discount;
       System.out.println("After 10% Discount the value:"+Afterdiscount);
    }
    else {
      System.out.println("Total costs of item"+TotalCost);
    }
    
  }

}