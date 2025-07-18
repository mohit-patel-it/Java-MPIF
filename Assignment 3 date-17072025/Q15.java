import java.util.Scanner;

class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cost price of the bike: ");
        double costPrice = sc.nextDouble();
        double tax;

        if (costPrice > 100000) {
            tax = (costPrice * 15)/100;
        }
        else if (costPrice > 50000 && costPrice <= 100000) {
            tax = (costPrice *10)/100;
        } 
        else {
            tax = (costPrice *5)/100;
        }

        System.out.println("Road tax to be paid: Rs. " + tax);
    }
}
