import java.util.concurrent.atomic.AtomicInteger;
class Employee {
    private static final AtomicInteger idGenerator = new AtomicInteger(1000);
    
    private int employeeId;
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.employeeId = idGenerator.getAndIncrement();
        this.name = name;
        this.department = department;
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        // Creating employee objects with auto-generated IDs
        Employee employee1 = new Employee("John Doe", "Engineering");
        Employee employee2 = new Employee("Jane Smith", "Marketing");

        // Displaying employee information
        System.out.println("Employee 1 Information:");
        employee1.displayEmployeeInfo();
        System.out.println("\nEmployee 2 Information:");
        employee2.displayEmployeeInfo();
    }
}