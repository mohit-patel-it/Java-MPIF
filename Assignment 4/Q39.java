// Strong number or not
import java.util.Scanner;
class Q39{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number you check Strong or not: ");
    int n=sc.nextInt();
    int temp=n;
    int sum=0;
    while(temp!=0)
    {
    int digit=temp%10;
    int fact=1;
    // int sum=0;
    for(int i=1;i<=digit;i++){
      fact=fact*i;
     }
    sum=sum+fact;
    temp=temp/10;
    }
    // System.out.println(sum);
    if(sum==n)
    System.out.println("strong number");
    else
    System.out.println("not a strong");
  }
}
