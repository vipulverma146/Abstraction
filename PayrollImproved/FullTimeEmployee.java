public class FullTimeEmployee extends Employee{
  
  private double salary;
  
  public FullTimeEmployee(String firstName, String lastName, double salary){
    super(firstName,lastName);
    this.salary = salary;
        System.out.println("Inside FullEmployee Constructor");
  }

  @Override
  public double getSalary(){
    return salary;
  }
}