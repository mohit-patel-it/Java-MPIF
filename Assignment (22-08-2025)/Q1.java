import java.util.Scanner;

class Product {
    int pid;
    String pname;
    double price;

    void getData(int i) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product " + i + " id : ");
        pid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Product " + i + " name : ");
        pname = sc.nextLine();
        System.out.print("Enter Product " + i + " price : ");
        price = sc.nextDouble();
    }

    void Display() {
        System.out.println(pid + "\t" + pname + "\t" + price);
    }
}

  class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of products : ");
        int size = sc.nextInt();
        Product pobj[] = new Product[size];

        for (int i = 0; i < size; i++) {
            pobj[i] = new Product();
            pobj[i].getData(i + 1);
        }

        System.out.println("\n1. Price in ascending order");
        System.out.println("2. Price in descending order");
        System.out.println("3. Lowest price product");
        System.out.println("4. Greatest price product");
        System.out.print("Enter your Choice (1/2/3/4) : ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                for (int i = 0; i < size - 1; i++) {
                    for (int j = 0; j < size - i - 1; j++) {
                        if (pobj[j].price > pobj[j + 1].price) {
                            Product temp = pobj[j];
                            pobj[j] = pobj[j + 1];
                            pobj[j + 1] = temp;
                        }
                    }
                }
                System.out.println("\nProducts in Ascending Order:");
                for (Product p : pobj) p.Display();
                break;

            case 2:
                for (int i = 0; i < size - 1; i++) {
                    for (int j = 0; j < size - i - 1; j++) {
                        if (pobj[j].price < pobj[j + 1].price) {
                            Product temp = pobj[j];
                            pobj[j] = pobj[j + 1];
                            pobj[j + 1] = temp;
                        }
                    }
                }
                System.out.println("\nProducts in Descending Order:");
                for (Product p : pobj) p.Display();
                break;

            case 3:
                Product min = pobj[0];
                for (int i = 1; i < size; i++) {
                    if (pobj[i].price < min.price) {
                        min = pobj[i];
                    }
                }
                System.out.println("\nLowest Price Product:");
                min.Display();
                break;

            case 4:
                Product max = pobj[0];
                for (int i = 1; i < size; i++) {
                    if (pobj[i].price > max.price) {
                        max = pobj[i];
                    }
                }
                System.out.println("\nGreatest Price Product:");
                max.Display();
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}