import java.util.Scanner;

class StudentResultChecker {
  private String name;
  private int mathMarks;
  private int scienceMarks;

  // Setter
  public void setDetails(String name, int mathMarks, int scienceMarks) {
    this.name = name;
    this.mathMarks = mathMarks;
    this.scienceMarks = scienceMarks;
  }

  // Method to check validity
  private boolean isValidMark(int mark) {
    return mark >= 0 && mark <= 100;
  }

  // Print details
  public void details() {
    System.out.println("\n--- Student Details ---");
    System.out.println("Name: " + name);

    if (isValidMark(mathMarks)) {
      System.out.println("Math Marks: " + mathMarks);
      } 
    else {
      System.out.println("Math Marks are invalid!");
      }

    if (isValidMark(scienceMarks)) {
      System.out.println("Science Marks: " + scienceMarks);
      } 
    else {
      System.out.println("Science Marks are invalid!");
      }
  }

  // Calculate average
  public void getAverage() {
    if (isValidMark(mathMarks) && isValidMark(scienceMarks)) {
      int avg = (mathMarks + scienceMarks) / 2;
      System.out.println("Average Marks: " + avg);
    } else {
      System.out.println("Cannot calculate average due to invalid marks.");
    }
  }
}

class ResultMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StudentResultChecker student = new StudentResultChecker();

    System.out.print("Enter Student Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Math Marks (0-100): ");
    int math = sc.nextInt();

    System.out.print("Enter Science Marks (0-100): ");
    int science = sc.nextInt();

    student.setDetails(name, math, science);
    student.details();
    student.getAverage();
  }
}
