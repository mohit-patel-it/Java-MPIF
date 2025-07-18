import java.util.Scanner;

class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if ((num & 1) == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }
}
