import  java.util.Scanner;

class Q6{
    public static void main(String args[]){
     
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the Value ");
      int  value = sc.nextInt();

      if ( value < 0){
        int absolutevalue = Math.abs(value);
        System.out.println("value is : " + absolutevalue);
        
      }
      else if(value==0){
        System.out.println("Number is Zero");
      }
      else{
        System.out.println("value is : " + value);
      }
  }
}