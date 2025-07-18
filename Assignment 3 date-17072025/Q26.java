import java.util.Scanner;

class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        switch (Math.abs(num % 2)) {//-25 is un Exeption of code so can we not -1 opition so thats is 
        case 0:
        System.out.println("Even");
         break;
        case 1:
        System.out.println("Odd");
         break;
        }
    }
}
