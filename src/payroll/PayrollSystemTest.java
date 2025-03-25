package payroll;

public class PayrollSystemTest {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee=new SalariedEmployee("Payel","Saha","111-11-111",800.00);
        HourlyEmployee hourlyEmployee=new HourlyEmployee("Rohit","Ghosh","222-22-2222",25.75,40);
        CommissionEmployee commissionEmployee=new CommissionEmployee("Sumit","Roy","333-33-3333",10000,.06);
        BasePlusCommissionEmployee basePlusCommissionEmployee=new BasePlusCommissionEmployee("Suraj","Verma","444-44-4444",5000,.04,300);

    }
}
