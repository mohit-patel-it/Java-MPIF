import java.util.Scanner;
class Q9{
  public static void main(String []args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Eneter number N to pritn even numbers:");
    int num=sc.nextInt();
    int x=0;
    for(int i=0;i<num;i++){
      //if(i%2==0){
        
        System.out.print(x+" ");
        x=x+2;
      //}
    }

  }
}