import java.util.Scanner;
class Q18{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int s1,s2,s3,s4,s5;

      System.out.println("Enter marks of Subject 1:");
      s1=sc.nextInt();
      if (s1 < 0 || s1 > 100) {
            System.out.println("Wrong marks Entered");
            return;
        }
      System.out.println("Enter marks of Subject 2:");
      s2=sc.nextInt();
      if (s2 < 0 || s2 > 100) {
            System.out.println("Wrong marks Entered");
            return;
        }
      System.out.println("Enter marks of Subject 3:");
      s3=sc.nextInt();
      if (s3 < 0 || s3 > 100) {
            System.out.println("Wrong marks Entered");
            return;
        }
      System.out.println("Enter marks of Subject 4:");
      s4=sc.nextInt();
      if (s4 < 0 || s4 > 100) {
            System.out.println("Wrong marks Entered");
            return;
        }
      System.out.println("Enter marks of Subject 5:");
      s5=sc.nextInt();
      if (s5 < 0 || s5 > 100) {
            System.out.println("Wrong marks Entered");
            return;
        }
        
      int totalMarks = s1 + s2 + s3 + s4 + s5;
        double percentage = (totalMarks / 500.0) * 100;

        System.out.println("Total Marks = " + totalMarks + " out of 500");
        System.out.printf("Percentage = %.2f%%\n", percentage);
    }
  }
