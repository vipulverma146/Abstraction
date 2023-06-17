public class Employee{
  private String firstName;
  private String lastName;

  public Employee(String firstName, String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
    System.out.println("Inside Employee Constructor");
  }

  public String fullName(){
    return this.firstName +" "+ this.lastName;
  }

  public double getSalary(){
    return 0;
  }
}