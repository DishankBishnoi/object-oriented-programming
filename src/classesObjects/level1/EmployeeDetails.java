package classesObjects.level1;

import java.util.Scanner;
class employee {
    String name;
    int id;
    int salary;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeDetails
{

    public static void main(String[] args) {
        employee emp1 = new employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the employee");
        emp1.name = sc.nextLine();
        System.out.println("Enter the id of the employee");
        emp1.id = sc.nextInt();
        System.out.println("Enter the salary of the employee");
        emp1.salary = sc.nextInt();

        emp1.display();

    }



}
