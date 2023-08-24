public class Employee {
private String nameOfEmployee;
private int department;
private int salary;
private int id;

    public Employee(String nameOfEmployee,int department, int salary) {
        this.nameOfEmployee = nameOfEmployee;
        this.department=department;
        this.salary=salary;
    }

    public String getNameOfEmployee() {
        return nameOfEmployee;
    }

    public int getId() {
        return id;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setNameOfEmployee(String nameOfEmployee) {
        this.nameOfEmployee = nameOfEmployee;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }
}
