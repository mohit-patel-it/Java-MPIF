import java.util.Scanner;
class Q41{
  public static void main(String []args){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter number a");
    int a=sc.nextInt();
    System.out.println("enter number b");
    int b=sc.nextInt();
    int temp=0;
    if(a>b){
      temp=a;
    }
    else{
      temp=b;
    }
    while(temp % a != 0 || temp % b != 0){
      temp++;
    }
    System.out.print("LCM of any two number is: "+ temp);

  }
}
/*
temp=(a>b)?a:b;
while(true){
if(temp%a==0&&temp%b==0){
Sop(temp)
}
temp++;
}