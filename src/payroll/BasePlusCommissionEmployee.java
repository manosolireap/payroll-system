package payroll;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String empId, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, empId, grossSales, commissionRate);
        setBaseSalary(baseSalary);
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double salary) {
        if(salary>=0.0)
            baseSalary=salary;
        else
            throw new IllegalArgumentException("Base salary must be >=0.0");
    }

    @Override
    public double earnings(){
        return getBaseSalary()+super.earnings();
    }

    @Override
    public String toString() {
        return String.format("%s %s; %s: Rs. %,.2f","base-salaried", super.toString(),
                "base salary",getBaseSalary());
    }
}
