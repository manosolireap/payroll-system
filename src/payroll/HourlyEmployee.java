package payroll;

public class HourlyEmployee extends Employee{

    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String empId, double wage, double hours) {
        super(firstName, lastName, empId);
        setWage(wage);
        setHours(hours);
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double hourlywage) {
        if(hourlywage>=0.0)
            wage = hourlywage;
        else
            throw new IllegalArgumentException("Hourly wage must be >=0.0");
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hoursWorked) {
        if((hoursWorked>=0.0) && (hoursWorked<=168.0))
            hours = hoursWorked;
        else
            throw new IllegalArgumentException("Hours worked must be >=0.0 and <=168.0");
    }

    @Override
    public double earnings() {
        if(getHours()<=40)
            return getWage()*getHours();
        else
            return 40*getWage()+(getHours()-40)*getWage()*1.5;
    }

    @Override
    public String toString() {
        return String.format("Hourly Employee:%s\n%s: Rs. %,.2f; %s: %,.2f",super.toString(),
                "hourly salary",getWage(),"hours worked",getHours());

    }
}
