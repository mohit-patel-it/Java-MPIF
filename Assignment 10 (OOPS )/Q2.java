class Library {
  String title;
  String author;
  float price;
  public void setter(String title,String author,float price){
    this.title=title;
    this.author=author;
    this.price=price;
  }
  public void Title(){
    System.out.println("Employee Id is:"+this.title);
  }
   public void Author(){
     System.out.println("Employee Name: "+this.author);
}
public void Price(){
  System.out.println("Employee Salary:"+this.price);
}
}
class LibraryMain{
      public static void main(String[] args) {
        Library Lib=new Library();
        Lib.setter("Math", "Vaibhav", 300);
        Lib.Title();
        Lib.Author();
        Lib.Price();
      }
}
