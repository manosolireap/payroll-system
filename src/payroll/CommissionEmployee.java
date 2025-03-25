package payroll;

public class CommissionEmployee extends Employee{

    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String empId, double grossSales, double commissionRate) {
        super(firstName, lastName, empId);
        setGrossSales(grossSales);
        setCommissionRate(commissionRate);
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double sales) {
        if(sales>=0.0)
            grossSales=sales;
        else
            throw new IllegalArgumentException("Gross sales must be >=0.0");
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double rate) {
        if(rate>0.0 && rate<1.0)
            commissionRate=rate;
        else
            throw new IllegalArgumentException("Commission rate must be >0.0 and <1.0");
    }

    @Override
    public double earnings() {
        return getCommissionRate()*getGrossSales();
    }

    public String toString(){
        return String.format("%s: %s\n%s: Rs. %,.2f; %s: %.2f","commission employee",super.toString(),
                "gross sales",getGrossSales(),"commission rate",getCommissionRate());
    }

}
