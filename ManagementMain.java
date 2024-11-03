
class Employee {
    protected String employeeId;
    protected String employeeName;
    protected double salary;

    public Employee(String employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }
}

class Developer extends Employee {
    private final double BONUS_RATE = 0.1;

    public Developer(String employeeId, String employeeName, double salary) {
        super(employeeId, employeeName, salary);
    }

    @Override
    public double getSalary() {
        return salary + (salary * BONUS_RATE);
    }
}

class Manager extends Employee {
    private final double BONUS_RATE = 0.2;

    public Manager(String employeeId, String employeeName, double salary) {
        super(employeeId, employeeName, salary);
    }

    @Override
    public double getSalary() {
        return salary + (salary * BONUS_RATE);
    }
}

public class ManagementMain {
    public static void main(String[] args) {
        Developer d1 = new Developer("1", "Hendra", 200000);
        Developer d2 = new Developer("2", "Ahsan", 150000);
        Manager m1 = new Manager("1", "Kevin", 300000);
        Manager m2 = new Manager("2", "Marcus", 500000);

        System.out.printf("Nama Pegawai: %s -- Gaji: Rp.%.1f%n", d1.getEmployeeName(), d1.getSalary());
        System.out.printf("Nama Pegawai: %s -- Gaji: Rp.%.1f%n", d2.getEmployeeName(), d2.getSalary());
        System.out.printf("Nama Pegawai: %s -- Gaji: Rp.%.1f%n", m1.getEmployeeName(), m1.getSalary());
        System.out.printf("Nama Pegawai: %s -- Gaji: Rp.%.1f%n", m2.getEmployeeName(), m2.getSalary());
    }
}