class Car{
  String brand;
  String model;
  int year;
  public void setter(String brand,String model,int year){
    this.brand=brand;
    this.model=model;
    this.year=year;
  }
  public void Brand(){
    System.out.println("Car Brand: "+model);
  }
  public void Model(){
    System.out.println("Car Model: "+brand);
  }
  public void year(){
    System.out.println("Year of manufacturing: "+year);
  }
}
class CarMain{
  public static void main(String[] args) {
    Car newcar=new Car();
    newcar.setter("Kia", "5i", 2025);
    newcar.Brand();
    newcar.Model();
    newcar.year();
  }
}
