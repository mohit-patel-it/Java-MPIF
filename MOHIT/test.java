import java.util.Scanner;
class test{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);

  
  System.out.println("\t\tD-Mart");
  System.out.println("Enter Costomer name: ");
  String name =sc.next();

  System.out.println("Enter Gender(male/female):");
  String gender=sc.next();

  int price1=10;
  int price2=20;
  int price3=30;
  int price4=40;
  int price5=50;
  int price6=60;
  int price7=70;
  int price8=80;
  int price9=90;
  int price10=100;


  System.out.println("Enter First Item nmae:");
  String Item1=sc.next();
  System.out.println("Eneter purchase quantity:");
  double quntity1=sc.nextDouble();
  double total1=quntity1*price1;
  double discount1=0;
  if(quntity1>4){
    discount1=(total1*0.05);
  }
  double final1=total1-discount1;
  sc.nextLine();

  System.out.println("Enter Second Item name:");
  String item2=sc.next();
  System.out.println("ENter Quantity:");
  double quantity2=sc.nextDouble();
  double total2=quantity2*price2;
  double final2=total2;
  sc.nextLine();

  System.out.println("Enter third Item name:");
  String item3=sc.next();
  System.out.println("ENter Quantity:");
  double quantity3=sc.nextDouble();
  double total3=quantity3*price3;
  double final3=total3;
  sc.nextLine();

  System.out.println("Enter 4th Item name:");
  String item4=sc.next();
  System.out.println("ENter Quantity:");
  double quantity4=sc.nextDouble();
  double total4=quantity4*price4;
  double final4=total4;
  sc.nextLine();

  System.out.println("Enter 5th Item name:");
  String item5=sc.next();
  System.out.println("ENter Quantity:");
  double quantity5=sc.nextDouble();
  double total5=quantity5*price5;
  double discount5=(total5*0.10);
  double final5=total5-discount5;
  sc.nextLine();

  System.out.println("Enter 6th Item name:");
  String item6=sc.next();
  System.out.println("ENter Quantity:");
  double quantity6=sc.nextDouble();
  double total6=quantity6*price6;
  double final6=total6;
  sc.nextLine();

  System.out.println("Enter 7th Item name:");
  String item7=sc.next();
  System.out.println("ENter Quantity:");
  double quantity7=sc.nextDouble();
  double total7=quantity7*price7;
  double final7=total7;
  sc.nextLine();

  System.out.println("Enter 8th Item name:");
  String item8=sc.next();
  System.out.println("ENter Quantity:");
  double quantity8=sc.nextDouble();
  double total8=quantity8*price8;
  double final8=total8;
  sc.nextLine();
  
  System.out.println("Enter 9th Item name:");
  String item9=sc.next();
  System.out.println("ENter Quantity:");
  double quantity9=sc.nextDouble();
  double total9=quantity9*price9;
  double final9=total9;
  sc.nextLine();

  System.out.println("Enter 10th Item Name:");
  String item10=sc.next();
  System.out.println("Enter Quantity:");
  double quantity10=sc.nextDouble();
  double total10=quantity10*price10;
  double discount10=(total10*0.15);
  double final10=total10-discount10;


  double actualAmount=total1+total2+total3+total4+total5+total6+total7+total8+total9+total10;

  double discountedAmount=final1+final2+final3+final4+final5+final6+final7+final8+final9+final10;

  double totalBillDiscount=0;
  if(discountedAmount>10000){
    totalBillDiscount=(discountedAmount*0.15);
  }
  else if(discountedAmount>=5000){
    totalBillDiscount=(discountedAmount*0.10);
  }
  double afterBillingDiscount=discountedAmount-totalBillDiscount;

  //ADDING GST 10%
  double gst=afterBillingDiscount*0.10;

  //Asking carry Bag
  sc.nextLine();
  System.out.println("Do you want carry bag?(yes/no)");
  int carryCharge=0;
  String carry=sc.next();
  if(carry.equalsIgnoreCase("yes")){
    carryCharge=10;
  }

  //gift on gender ke chakkar
  //String gift="";
  if(gender.equalsIgnoreCase("female")){
    System.out.println("Cadeberry");
  }
  else {
    System.out.println("Ladger Wallet");
  }
  double finalBill=afterBillingDiscount+gst+carryCharge;

        System.out.println("\t\t\t\tD-Mart");
        System.out.println("Name:"+name+"\t\t\t\tDate:22/07/2025");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("item Name\tQuantity\tPrice\t\tTotal\t  AfterDiscount");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println(Item1+"\t\t"+quntity1+"\t\t"+price1+"\t\t"+total1+"\t\t"+final1);
        System.out.println(item2 + "\t\t" +quantity2+ "\t\t" + price2 + "\t\t" + total2 + "\t\t" + final2);
        System.out.println(item3 + "\t\t" +quantity3 + "\t\t" + price3 + "\t\t" + total3 + "\t\t" + final3);
        System.out.println(item4 + "\t\t" +quantity4 + "\t\t" + price4 + "\t\t" + total4 + "\t\t" + final4);
        System.out.println(item5 + "\t\t" +quantity5 + "\t\t" + price5 + "\t\t" + total5 + "\t\t" + final5);
        System.out.println(item6 + "\t\t" +quantity6 + "\t\t" + price6 + "\t\t" + total6 + "\t\t" + final6);
        System.out.println(item7 + "\t\t" +quantity7+ "\t\t" + price7 + "\t\t" + total7 + "\t\t" + final7);
        System.out.println(item8 + "\t\t" +quantity8+ "\t\t" + price8 + "\t\t" + total8 + "\t\t" + final8);
        System.out.println(item9 + "\t\t" +quantity9+ "\t\t" + price9 + "\t\t" + total9 + "\t\t" + final9);
        System.out.println(item10 + "\t\t" +quantity10 + "\t\t" + price10 + "\t\t" + total10 + "\t\t" + final10);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("\t\t\tActual Price: " + actualAmount + "\tDiscounted Price: " + afterBillingDiscount);
        String gift = (gender.equalsIgnoreCase("female")) ? "Cadeberry" : "Ladger Wallet";  
        System.out.println("Gift: " + gift + "\t\t0.00\t\t0.00");
        System.out.println("Carry Bag: " + carry + "\t\t" + carryCharge + "\t\t" + carryCharge);
        System.out.println("GST (10%): \t\t" + gst + "\t" + gst);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("\t\tFinal Amount:\t\t" + finalBill + " Rs");
        System.out.println("\t\t\tThank You for visiting D-Mart");

  }
}