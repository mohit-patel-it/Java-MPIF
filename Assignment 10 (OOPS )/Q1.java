class Employee {
    int id;
    String name;  
    float salary;
  public void setter(int id,String name, float salary){
    this.id=id;
    this.name=name;
    this.salary=salary;
  }
  public void ID(){
  System.out.println("Employee Id is:"+this.id);
}
public void Name(){
  System.out.println("Employee Name: "+this.name);
}
public void Salary(){
  System.out.println("Employee Salary:"+this.salary);
}
}
class EmployeeMain{
  public static void main(String[] args) {
    Employee em=new Employee();
    em.setter(1002, "vaibhav", 8000);
    em.ID();
    em.Name();
    em.Salary();

  }
}
