import java.util.Scanner;
class Q9{
 public static void main(String []args){
 Scanner sc= new Scanner(System.in);

 System.out.println("Enter Character: ");
 char ch = sc.next().charAt(0);
 if (ch >= 'A' && ch <= 'Z') {
            System.out.println("The character is UPPERCASE.");
    }
     else if (ch >= 'a' && ch <= 'z') {
            System.out.println("The character is lowercase.");
        } 
   else {
            System.out.println("The character is not in range (A-Z or a-z).");
        }
 }
 }