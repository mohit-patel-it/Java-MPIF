import java.util.Scanner;

class Q43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter electricity units consumed: ");
        float units = sc.nextFloat();
        float bill = 0;

        if (units <= 50)
            bill = units * 0.50f;
        else if (units <= 150)
            bill = 50 * 0.50f + (units - 50) * 0.75f;
        else if (units <= 250)
            bill = 50 * 0.50f + 100 * 0.75f + (units - 150) * 1.20f;
        else
            bill = 50 * 0.50f + 100 * 0.75f + 100 * 1.20f + (units - 250) * 1.50f;

        float surcharge = bill * 0.20f;
        float total = bill + surcharge;

        System.out.println("Total Electricity Bill = Rs." + total);
    }
}
