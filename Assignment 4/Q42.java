//
//
//HCF=Highest common factor like 4 factors=1,2,4 
// and 6 factors=1,2,3,6 isme jo bhi highest factors
// match honge unka count denge
import java.util.Scanner;
class Q42{
  public static void main(String []args){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter n1");
    int num1=sc.nextInt();

    System.out.println("enter n2");
    int num2=sc.nextInt();
    int num3=0;

    while(num2!=0){
      num3=num1%num2;
      num1=num2;
      num2=num3;
    }
      // System.out.println(num1);
      // System.out.println(num2);
    if(num1>=num2){
      System.out.print("HCF is"+num1);
    }
    else{
      System.out.print("HCF is"+num2);
    }
  }
}

/*method-2
a=4 and b=6
a or b ko compare karenge jisme jo chota hoga utni baar loop chalega
if(a<b){
 temp=a;
}
else{
temp=b;
}
for(int i=1;i<=temp;i++){
  if(a%i==0 && b%i==0){
  commonFactor=i;
  }
}
sop(cf)
