import java.util.Scanner;;
class MobilePhoneStore{
  private String brand;
  private String model;
  private int price;

  public void setter(String brand, String model, int price){
    this.brand=brand;
    this.model=model;
    this.price=price;
  }
  private boolean isValidPrice(int price) {
    return price >= 0 && price < 20000;
  }
  public void details(){
    System.out.println("---Phone Details---");
    System.out.println("Brand name : "+brand);
    System.out.println("Model name : "+model);
     if(isValidPrice(price)) {
      System.out.println("Phone Price: " + price);
      System.out.println("Phone is under"+ price +"so its affordable");
      } 
    else {
      System.out.println("Phone is not affortable");
      }
  }
}
class MobileMain{
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    MobilePhoneStore phone=new MobilePhoneStore();

    System.out.print("Enter Brand Name : ");
    String brand = sc.nextLine();

    System.out.print("Enter Model : ");
    String model= sc.next();

    System.out.print("Enter Price : ");
    int price = sc.nextInt();

    phone.setter(brand, model, price);
    phone.details();
   }
}