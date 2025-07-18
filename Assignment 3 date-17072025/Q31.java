import java.util.Scanner;

class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'C' to convert F to C or 'F' to convert C to F: ");
        char choice = sc.next().charAt(0);

        if (choice == 'C' || choice == 'c') {
            System.out.print("Enter temperature in Fahrenheit: ");
            double f = sc.nextDouble();
            double c = (f - 32) * 5 / 9;
            System.out.printf("Temperature in Celsius: %.2f\n", c);
        } else if (choice == 'F' || choice == 'f') {
            System.out.print("Enter temperature in Celsius: ");
            double c = sc.nextDouble();
            double f = (c * 9 / 5) + 32;
            System.out.printf("Temperature in Fahrenheit: %.2f\n", f);
        } else {
            System.out.println("Invalid choice!");
        }
    }
}
