public class Employee {
    private String nameOfEmployee;
    private int department;
    private double salary;
    private int id;
    private static int count;


    public Employee(String nameOfEmployee, int department, int salary) {
        count++;
        this.id = count;
        this.nameOfEmployee = nameOfEmployee;
        this.department = department;
        this.salary = salary;
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

    public double getSalary() {
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

    public static int getCount() {
        return count;
    }

    public static void printSeparator() {
        System.out.println("====================");
    }


    public int id(Employee[] employees) {
        for (int i = 0; i < id; i++) {
            Employee employee = employees[i];
        }
        return count;
    }

    public static void showEmployee(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getId() + " " + employees[i].getNameOfEmployee() + ", " + employees[i].getDepartment() + ", " + employees[i].getSalary());
        }
    }

    public static double sumSalary(Employee[] employees) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();

        }
        return sum;
    }

    public static double maxSalary(Employee[] employees) {
        double maxSalary = 0;
        //  double minSalary = -1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].salary >= maxSalary) {
                maxSalary = employees[i].salary;
            }
        }
        return maxSalary;
    }

    public static double minSalary(Employee[] employees) {
        double minSalary = employees[0].salary;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].salary <= minSalary) {
                minSalary = employees[i].salary;
            }
        }
        return minSalary;

    }

    public static double middleSalary(Employee[] employees) {
        double middleSalary = sumSalary(employees) / employees.length;
        return middleSalary;
    }

    public String toString() {
        return nameOfEmployee;
    }
}

