import java.util.Objects;

public class Employee {
    private final String employee;
    private int department;
    private int salary;
    private final int id;
    static int counter = 0;
    public Employee(String employee, int department, int salary) {
        this.employee = employee;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }
    public String getEmployee() {
        return employee;
    }
    public int getDepartment() {
        return department;
    }
    public int getSalary() {
        return this.salary;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Сотрудник: " + employee + "," + " Отдел № " + department + "," + " Зарплата " + salary + " рублей";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee1 = (Employee) o;
        return department == employee1.department && salary == employee1.salary && id == employee1.id && employee.equals(employee1.employee);
    }
    @Override
    public int hashCode() {
        return Objects.hash(employee, department, salary, id);
    }
}
