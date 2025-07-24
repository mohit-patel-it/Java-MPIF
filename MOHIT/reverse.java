import java.util.Scanner;
class reverse{
  public static void main(String []args){
    Scanner sc= new Scanner(System.in);
    System.out.println("ente numbers a:");
    int a=sc.nextInt();
    System.out.println("ente numbers b:");
    int b=sc.nextInt();
  //with third variable
    /*int c;
    c=a;
    a=b;
    b=c;
    System.out.println("a:"+a+"\nb:"+b);
    */

  //Without third variable
   /*
    b=a+b;//a=20,b=10;20+10=30=b; b-a==30-20=10=a;
    a=b-a;//
    b=b-a;
    System.out.println("a:"+a+"\nb:"+b);
      */

    //by Multiply without third variable
    /*
    a=a*b;//20*10=200=a
    b=a/b;//200/10=20=b
    a=a/b;
    System.out.println("a:"+a+"\nb:"+b);
    */

    //Swapping with a ^ Operator   
    a=a^b;
    a=a^b;
    b=b^a;
    System.out.println("a:"+a+"\nb:"+b);
  }
}