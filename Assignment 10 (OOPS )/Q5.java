class ProductInventory{
  private int productId;
  private String name;
  private int quantity;
  private int price;
  public void setter(int productId,String name,int quantity,int price){
    this.productId=productId;
    this.name=name;
    this.quantity=quantity;
    this.price=price;
  }
  public void details(){
    System.out.println("Product id is : "+productId);
    System.out.println("product name: "+name);
    System.out.println("product quantity: "+quantity);
    System.out.println("product price: "+price);
  }
}
class ProductMain{
  public static void main(String[] args) {
    ProductInventory Product=new ProductInventory();
    Product.setter(102,"Soap",10,100);
    Product.details();
  }
}
