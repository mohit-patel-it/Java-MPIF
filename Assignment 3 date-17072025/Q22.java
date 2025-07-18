import java.util.Scanner;

class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if((a==b)&&(a==c)){
          if(a==0&&b==0&&c==0){
           System.out.println("Number is zero"); 
          }
          else
          System.out.println("Numbers are equal");
        }
        else if (a >= b && a >= c){
            System.out.println("Greatest is: " + a);
        }
        else if (b >= a && b >= c){
            System.out.println("Greatest is: " + b);
        }
        else{
            System.out.println("Greatest is: " + c);
        }
    }
}
