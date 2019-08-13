import java.util.Objects;

public class Employee implements Cloneable{

    private int empoyeeId;
    private String employeeName;
    private Department department;

    public Employee(int id, String name, Department dept)
    {
        this.empoyeeId = id;
        this.employeeName = name;
        this.department = dept;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return getEmpoyeeId() == employee.getEmpoyeeId() &&
                Objects.equals(getEmployeeName(), employee.getEmployeeName()) &&
                Objects.equals(getDepartment(), employee.getDepartment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmpoyeeId(), getEmployeeName(), getDepartment());
    }

    //Getters and Setters


    public int getEmpoyeeId() {
        return empoyeeId;
    }

    public void setEmpoyeeId(int empoyeeId) {
        this.empoyeeId = empoyeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}