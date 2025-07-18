import java.util.Scanner;

class Q41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of Physics, Chemistry, Biology, Math, Computer:");
        int p = sc.nextInt(), c = sc.nextInt(), b = sc.nextInt(), m = sc.nextInt(), com = sc.nextInt();

        float percentage = (p + c + b + m + com) / 5.0f;
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 90)
            System.out.println("Grade A");
        else if (percentage >= 80)
            System.out.println("Grade B");
        else if (percentage >= 70)
            System.out.println("Grade C");
        else if (percentage >= 60)
            System.out.println("Grade D");
        else if (percentage >= 40)
            System.out.println("Grade E");
        else
            System.out.println("Grade F");
    }
}
