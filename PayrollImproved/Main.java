class Main {
  public static void main(String[] args) {
    Payroll payroll = new Payroll();

payroll.add(new FullTimeEmployee("John", "Doe", 6000));
payroll.add(new FullTimeEmployee("Jane", "Doe", 6500));
payroll.add(new HourlyEmployee("Jenifer", "Smith", 200, 50));
payroll.add(new HourlyEmployee("David", "Wilson", 150, 100));
payroll.add(new HourlyEmployee("Kevin", "Miller", 100, 150));

payroll.print();
  }
}