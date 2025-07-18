import java.util.Scanner;

class Q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three angles of triangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b + c == 180)
            System.out.println("Triangle is Valid");
        else
            System.out.println("Invalid Triangle");
    }
}
