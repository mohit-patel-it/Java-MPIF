import  java.util.Scanner;

class Q5{
    public static void main(String args[]){
     
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter Ram age : ");
      int  Ram = sc.nextInt();

      System.out.println("Enter Mohit age : ");
      int Mohit  = sc.nextInt();

      System.out.println("Enter Pinku age : ");
      int   Pinku = sc.nextInt();

      if( Ram > Mohit && Ram > Pinku){
        System.out.println("Ram is Oldest Person");
      }
      else if( Mohit > Ram && Mohit > Pinku){
        System.out.println("Mohit is Oldest Person");

      }
      else{
        System.out.println("Pinku is Oldest Person");
     }


     if( Ram < Mohit && Ram < Pinku){
        System.out.println("Ram is Youngest Person");
      }
      else if( Mohit < Ram && Mohit < Pinku){
        System.out.println("Mohit is Youngest Person");

      }
      else{
        System.out.println("Pinku is Youngest Person");

      }

  }
}