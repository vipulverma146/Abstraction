public abstract class Employee{
  private String firstName;
  private String lastName;

  // Abstract class can have constructor. but cannot be instantiated. This constructor is used by the child class to construct the base object then the child object subsequently.
  public Employee(String firstName, String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
    System.out.println("Inside Employee Constructor");
  }

  public String fullName(){
    return this.firstName +" "+ this.lastName;
  }

  public abstract double getSalary();
}