class costomer {
private int id; 
private String Firstname;
private String LastName;
private String ContactNo;
private String AccountNo;
private String address;
private float balance;

public void setter(int id,String Firstname,String LastName,String ContactNo,String AccountNo,String address,float balance){
  this.id=id;
  this.Firstname=Firstname;
  this.LastName=LastName;
  this.ContactNo=ContactNo;
  this.AccountNo=AccountNo;
  this.address=address;
  this.balance=balance;
}
public void balanceEnquiry(){
  System.out.println("Current balance: "+this.balance);
}
public void deposite(int amount){
  this.balance=this.balance+amount;
  System.out.println("After Deposite\n");
  this.balanceEnquiry();
}
public void withdrawal(int amount){
  if(amount>this.balance){
    System.out.println("Insufficient funds in your account");
  }
  else{
    this.balance=this.balance-amount;
    this.balanceEnquiry();
  }
}
public void AccountHolderName(){
  System.out.println("Name of Account Holder is : "+Firstname+" "+ LastName);
}
public void AccountNumber(){
  System.out.println("Account Number :"+AccountNo);
}

}

class Bank{
  public static void main(String[] args) {
    costomer vaibhav= new costomer();
    vaibhav.setter(1002, "vaibhav", "Dapkara", "9340828510", "630502105", "kb colony", 25000);
    //vaibhav.deposite(5000);
    //vaibhav.withdrawal(2500);
    vaibhav.AccountHolderName();
    vaibhav.AccountNumber();
    vaibhav.balanceEnquiry();
  }
}


