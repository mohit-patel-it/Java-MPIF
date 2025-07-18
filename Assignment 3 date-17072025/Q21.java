import java.util.Scanner;

class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b)
            System.out.println("Greater number is: " + a);
        else if (b > a)
            System.out.println("Greater number is: " + b);
        else
            System.out.println("Both are equal.");
    }
}
