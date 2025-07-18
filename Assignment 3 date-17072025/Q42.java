import java.util.Scanner;

class Q42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        float basic = sc.nextFloat();
        float hra, da, gross;

        if (basic <= 10000) {
            hra = basic * 0.20f;
            da = basic * 0.80f;
        } else if (basic <= 20000) {
            hra = basic * 0.25f;
            da = basic * 0.90f;
        } else {
            hra = basic * 0.30f;
            da = basic * 0.95f;
        }

        gross = basic + hra + da;
        System.out.println("Gross Salary = " + gross);
    }
}
