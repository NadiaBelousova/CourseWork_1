public class Employee {
    private final String nameOfEmployee;
    private int department;
    private int salary;
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

    public int getSalary() {
        return salary;
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


    //public int id(Employee[] employees) {
       // for (int i = 0; i < id; i++) {
        //    Employee employee = employees[i];
       // }
       // return count;
   // }

    public static void showEmployee(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].id + " " + employees[i].nameOfEmployee + ", " + employees[i].department + ", " + employees[i].salary);
            }
        }
    }

    public static int sumSalary(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum = (sum + employees[i].salary);
            }
        }
        return sum;
    }

    public static Employee maxSalary(Employee[] employees) {
        int maxSalary = Integer.MIN_VALUE;
        int index=0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].salary >= maxSalary) {
                maxSalary = employees[i].salary;
                index=i;
            }
        }
        return employees[index];
    }

    public static Employee minSalary(Employee[] employees) {
        int minSalary = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].salary <= minSalary) {
                minSalary = employees[i].salary;
                index = i;
            }
        }
        return employees[index];

    }

    public static double middleSalary(Employee[] employees) {
        int k = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                k++;
            }
        }
        double middleSalary = (double) sumSalary(employees) / k;
        return middleSalary;
    }

    public static void showEmployeeName(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {

               System.out.println("ФИО сотрудника: " + employees[i].nameOfEmployee);
            }
        }
    }
}

