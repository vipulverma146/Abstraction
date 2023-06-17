public class HourlyEmployee extends Employee{
  
  private double workedHours;
  private double rate;
  
  public HourlyEmployee(String firstName, String lastName, double workedHours, double rate){
    super(firstName,lastName);
    this.workedHours = workedHours;
    this.rate = rate;
    System.out.println("Inside HourlyEmployee Constructor");
  }

  @Override
  public double getSalary(){
    return rate * workedHours;
  }
}