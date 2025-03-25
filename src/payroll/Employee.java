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

    public abstract double earnings();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
        
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return String.format("%s %s\n ID: %s",getFirstName(),getLastName(),getEmpId());
    }
}
