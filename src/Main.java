public class Main {
    //Базовый уровень
    private static Employee[] employees = new Employee[10];
    public static void printSeparator() {
        System.out.println("==============================================================================");
    }
    public static void printAllData() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
            }
            System.out.println(employees[i]);
        }
    }
    public static void calculateSalary() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees != null) {
                sum += employees[i].getSalary();
            }
        }
        System.out.println("Общая сумма зарплат сотрудников: " + sum + " рублей");
    }
    public static void minSalary() {
        int min = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (min > employees[i].getSalary() && employees != null) {
                min = employees[i].getSalary();
            }
        }
        System.out.println("Минимальная зарплата сотрудника: " + min + " рублей");
    }
    public static void maxSalary() {
        int max = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (max < employees[i].getSalary() && employees != null) {
                max = employees[i].getSalary();
            }
        }
        System.out.println("Максимальная зарплата сотрудника: " + max + " рублей");
    }
    public static void averageSalary() {
        int averageSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            averageSalary += employees[i].getSalary() / employees.length;
        }
        System.out.println("Средняя зарплата сотрудников: " + averageSalary + " рублей");
    }
    public static void printAllNameAndLastName() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
            }
            System.out.println(employees[i].getEmployee());
        }
    }
    public static void main(String[] args) {
        employees = new Employee[]{
                new Employee("Шамарин Евгений Николаевич", 1, 100_000),
                new Employee("Желтикова Анна Александровна", 2, 160_000),
                new Employee("Сытников Никита Александрович", 3, 80_000),
                new Employee("Кулага Владислав Александрович", 4, 70_000),
                new Employee("Вовк Дмитрий Вадимович", 5, 90_000)
        };
        printSeparator();
        System.out.println("Информация о всех сотрудниках: ");
        printAllData();
        printSeparator();
        calculateSalary();
        printSeparator();
        minSalary();
        printSeparator();
        maxSalary();
        printSeparator();
        averageSalary();
        printSeparator();
        System.out.println("Ф.И.О. всех сотрудников: ");
        printAllNameAndLastName();
        printSeparator();
    }
}