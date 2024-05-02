import java.lang.*;
import java.util.*;

class Employee {
    String name;
    String address;
    int salary;

}

class Manager extends Employee {
    void Manager(String name, String address, int salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;

        System.out.println("Name:" + name);
        System.out.println("Address:" + address);
        System.out.println("Post: Manager");
        System.out.println("Salary:" + salary);
        System.out.println("Bonus:" + salary * 0.5);

    }
}

class Developer extends Employee {
    void Developer(String name, String address, int salary) {

        this.name = name;
        this.address = address;
        this.salary = salary;

        System.out.println("Name:" + name);
        System.out.println("Address:" + address);
        System.out.println("Name: Developer");
        System.out.println("Salary:" + salary);
        System.out.println("Bonus:" + salary * 0.3);

    }
}

class Programmer extends Employee {
    void Programmer(String name, String address, int salary) {

        this.name = name;
        this.address = address;
        this.salary = salary;

        System.out.println("Name:" + name);
        System.out.println("Address:" + address);
        System.out.println("Name: Programmer");
        System.out.println("Salary:" + salary);
        System.out.println("Bonus:" + salary * 0.2);

    }

}

class SKY {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Manager M = new Manager();
        Developer D = new Developer();
        Programmer P = new Programmer();

        System.out.print("\n Enter Your Name:");
        String name = sc.nextLine();

        System.out.print("\n Enter Your Adderss:");
        String address = sc.nextLine();

        System.out.print("\n Enter Your Salary:");
        int salary = sc.nextInt();

        System.out.println("\nChoose your post \n1. Manager \n2. Developer \n3. Programmer");
        System.out.println("\nEnter Your Choice:");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                M.Manager(name, address, salary);
                break;

            case 2:
                D.Developer(name, address, salary);
                break;

            case 3:
                P.Programmer(name, address, salary);
                break;

            default:
                System.out.println("Wrong Choice Sorry!");
                break;
        }

    }
}