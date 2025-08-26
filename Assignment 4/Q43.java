import java.util.Scanner;
class Q43{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 0 and 1 binary number: ");
        int binary = sc.nextInt();

        int decimal = 0, power = 0;

        while (binary > 0) {
            int lastDigit = binary % 10;
            decimal += lastDigit * Math.pow(2, power);
            power++;
            binary =binary/ 10;
        }

        System.out.println("Decimal value: " + decimal);
    }
}
/*
