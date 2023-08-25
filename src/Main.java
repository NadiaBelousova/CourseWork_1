

public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Василий Иванович Пупкин", 1, 36000);
        employee[1] = new Employee("Анна Иосифовна Трубецкая", 4, 74000);
        employee[2] = new Employee("Петр Николаевич Корабелкин", 4, 75000);
        employee[3] = new Employee("Ирина Васильевна Иванова", 3, 66000);
        employee[4] = new Employee("Семен Семенович Крупский", 2, 42000);
        employee[5] = new Employee("Алексей Николаевич Шабанов", 2, 40000);
        employee[6] = new Employee("Зинаида Петровна Семенова", 3, 65000);
        employee[7] = new Employee("Давид Давидович Мартиросян", 5, 79000);
        employee[8] = new Employee("Анастасия Игоревна Турцкевич", 5, 70000);
        employee[9] = new Employee("Лидия Ивановна Разумихина", 1, 35000);


       Employee.showEmployee(employee);
        Employee.printSeparator();
       System.out.println("Общее количество сотрудников - " + Employee.getCount());
        Employee.printSeparator();
        System.out.println("Сумма затрат на зарплаты в месяц - " + Employee.sumSalary(employee));
        Employee.printSeparator();
        System.out.println("Максимальая зарплата - " + Employee.maxSalary(employee));
        Employee.printSeparator();
        System.out.println("Минимальная зарплата - " + Employee.minSalary(employee));
        Employee.printSeparator();
        System.out.println("Среднее значение зарплат -" +Employee.middleSalary(employee));
        Employee.printSeparator();

    }
}