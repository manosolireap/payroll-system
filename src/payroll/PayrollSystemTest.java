package payroll;

import java.util.Arrays;

public class PayrollSystemTest {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee=new SalariedEmployee("Payel","Saha","111-11-111",800.00);
        HourlyEmployee hourlyEmployee=new HourlyEmployee("Rohit","Ghosh","222-22-2222",25.75,40);
        CommissionEmployee commissionEmployee=new CommissionEmployee("Sumit","Roy","333-33-3333",10000,.06);
        BasePlusCommissionEmployee basePlusCommissionEmployee=new BasePlusCommissionEmployee("Suraj","Verma","444-44-4444",5000,.04,300);

        System.out.println("Employees processed individualy:\n");
        System.out.printf("%s\n%s: Rs.%,.2f\n\n",salariedEmployee,"earned",salariedEmployee.earnings());
        System.out.printf("%s\n%s: Rs.%,.2f\n\n",hourlyEmployee,"earned",hourlyEmployee.earnings());
        System.out.printf("%s\n%s: Rs.%,.2f\n\n",commissionEmployee,"earned",commissionEmployee.earnings());
        System.out.printf("%s\n%s: Rs.%,.2f\n\n",basePlusCommissionEmployee,"earned",basePlusCommissionEmployee.earnings());

        Employee[] employees=new Employee[4];
        employees[0]=salariedEmployee;
        employees[1]=hourlyEmployee;
        employees[2]=commissionEmployee;
        employees[3]=basePlusCommissionEmployee;

        System.out.println("Employees processed polymorphically:\n");
        for(Employee currentEmployee:employees){
            System.out.println(currentEmployee);
            if(currentEmployee instanceof BasePlusCommissionEmployee){
                BasePlusCommissionEmployee employee=(BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(1.10*employee.getBaseSalary());
                System.out.printf("new base salary with10%% increase is Rs. %,.2f\n",employee.getBaseSalary());
            }
            System.out.printf("earned Rs. %,.2f\n\n",currentEmployee.earnings());
        }
        for (int i = 0; i < employees.length; i++) {
            System.out.printf("Employee %d is a %s\n",i,employees[i].getClass().getName());
        }
    }
}
