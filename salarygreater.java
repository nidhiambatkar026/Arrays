import java.io.*;
import java.lang.*;
import java.util.Scanner;

class Employee{
    String emp_name;
    float Salary;
    int id;

    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Name: ");
        emp_name = sc.nextLine();
        System.out.println("Enter Salary of the Employee: ");
        Salary = sc.nextFloat();
        System.out.println("Enter Employee ID: ");
        id = sc.nextInt();
    } 
    void display(){
        if (Salary > 5000){
            System.out.println("Employee Name: "+emp_name);
            System.out.println("Salary of Employee: "+Salary);
            System.out.println("Employee ID: "+id);
        }
    }
}
public class salarygreater {
    public static void main(String[] args) {
        Employee e[] = new Employee[5];
        for(int i=0;i<5;i++){
            e[i] = new Employee();
            e[i].accept();
        }
        for(int i=0;i<5;i++){
            e[i].display();
        }
    }
}