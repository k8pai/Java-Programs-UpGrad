class Employee {

    private int empId;
    private String empFirstName;
    private String empSecondName;
    private double empSalary;

    public Employee(int id, String firstname, String secondName, double salary) {

        this.empId = id;
        this.empFirstName = firstname;
        this.empSecondName = secondName;
        this.empSalary = salary;

    }

    public int getId() {
        return empId;
    }

    public String getFirstName() {
        return empFirstName;
    }

    public String getSecondName() {
        return empSecondName;
    }

    public String getFullName() {
        return getFirstName() + " " + getSecondName();
    }

    public double getSalary() {
        return empSalary;
    }

    public double getAnnualPay() {
        return 12 * getSalary();
    }


}

public class Source {
    public static void main(String[] args) {
        Employee E1 = new Employee(101512031, "Sushil", "Kumar", 45000.58);

        System.out.println("employee full name" + " " + E1.getFullName());
        System.out.println("employee annual package" + " " + E1.getAnnualPay());

        Employee E2 = new Employee(101512032, "Tara", "Sharma", 51000.99);

        System.out.println("employee full name" + " " + E2.getFullName());
        System.out.println("employee annual package" + " " + E2.getAnnualPay());
    }
}




