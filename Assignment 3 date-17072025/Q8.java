import java.util.Scanner;

class Q8 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total number of class held: ");
        int totalClass = sc.nextInt();

        System.out.println("Enter number of classes attended by student: ");
        int attendClass = sc.nextInt();

                if (totalClass <= 0) {
            System.out.println("Total classes should be greater than 0.");
            return;
        }

        int percentage = (attendClass * 100) / totalClass;

                if (percentage < 0 || percentage > 100) {
            System.out.println("Data is not correct. Attendance percentage can't be more than 100% or less than 0%");
        } else {
            System.out.println("Your attendance is " + percentage + "%");

            if (percentage >= 75) {
                System.out.println("You are Eligible for Entering the exam");
            } else {
                System.out.println("Do you have any medical issue? (y/n): ");
                String medical = sc.next();
                if (medical.equalsIgnoreCase("y")) {
                    System.out.println("You are eligible because of your medical issue");
                } else {
                    System.out.println("You are not Eligible for Entering the exam");
                }
            }
        }
    }
}
