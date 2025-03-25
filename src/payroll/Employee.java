package payroll;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String empId;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String empId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.empId = empId;
    }
}
