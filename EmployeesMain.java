import java.io.*;
import java.util.Scanner;

class Employees {
    int ID;
    String emp_name;
    float Salary;

    void accept(Scanner sc) {
        System.out.println("Enter Employee ID: ");
        ID = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.println("Enter the name of Employee: ");
        emp_name = sc.nextLine();
        System.out.println("Enter Salary of the employee: ");
        Salary = sc.nextFloat();
    }

    void display() {
        System.out.println("\nEmp_ID: " + ID);
        System.out.println("Emp_Name: " + emp_name);
        System.out.println("Emp_Salary: " + Salary);
    }
}

public class EmployeesMain {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        Employees employees[] = new Employees[4];

        for (int i = 0; i < 4; i++) {
            employees[i] = new Employees();
            employees[i].accept(sc);
        }

        System.out.println("\nEmployee Details:");
        for (int i = 0; i < 4; i++) {
            employees[i].display();
        }

        sc.close();
    }
}
