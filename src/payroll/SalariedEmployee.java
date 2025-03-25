package payroll;

public class SalariedEmployee extends Employee{

    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String empId, double salary) {
        super(firstName, lastName, empId);
        this.weeklySalary = salary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double salary) {

        if(weeklySalary>=0.0)
            weeklySalary = salary;
        else
            throw new IllegalArgumentException("Weekly salary must be >=0.0");
    }

    @Override
    public double earnings() {
        return weeklySalary;

    }

    @Override
    public String toString() {
        return String.format("Salaried Employee:%s\n%s: Rs. %,.2f",super.toString(),
                "weekly salary",getWeeklySalary());

    }
}
