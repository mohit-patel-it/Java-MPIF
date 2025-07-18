import  java.util.Scanner;

class Q7{
    public static void main(String args[]){
     
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter total number of class held : ");
      int  Totalclass = sc.nextInt();

      System.out.println("Enter the student to attend the classes: ");
      int  Attendclass = sc.nextInt();

      int percentage =(Attendclass * 100 )/Totalclass;

      System.out.println("Your attendence is " + percentage + "%");

      if(percentage>=75 && percentage<=100){
        System.out.println("You are Eligible for Entering the exam");
      }
      //else if(){

      //}
      else{
        System.out.println("You are not Eligible for Entering the exam");

      }
  }
}