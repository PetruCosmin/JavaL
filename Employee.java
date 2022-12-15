package Angajat;
//importam clasa scanner
import java.util.Scanner;
public class Employee {
    private int empNum;
    private String empLastName;
    private String empFirstName;
    private double empSalary;

    //Mutator method (setter)
    public void setEmpNum(int emp) {
        empNum = emp;
    }
    //Accessor method (getter)
    public int getEmpNum() {
        return empNum;
    }
    public String getEmpLastName() {
        return empLastName;
    }
    public void setEmpLastName(String name) {
        empLastName = name;
    }
    public String getEmpFirstName() {
        return empFirstName;
    }
    public void setEmpFirstName(String name){
        empFirstName = name;
    }
    public double getEmpSalary() {
        return empSalary;
    }
    public void setEmpSalary(double sal){
        empSalary = sal;
    }
}

class DeclareTwoEmployees1 {
    public static void main(String[] args) {
        Employee clerk = new Employee();
        Employee driver = new Employee();
        clerk = getData(clerk);
        driver = getData(driver);
        System.out.println("Clerk details:");
        System.out.println(clerk.getEmpNum() + " " + clerk.getEmpFirstName() + " "
                + clerk.getEmpLastName() + " " + clerk.getEmpSalary() + " RON");
        System.out.println("Driver details:");
        System.out.println(driver.getEmpNum() + " " + driver.getEmpFirstName() + " "
                + driver.getEmpLastName() + " " + driver.getEmpSalary() + " RON");
    }
    public static Employee getData(Employee emp){
        int num = 0;
        String firstName, lastName;
        double salary;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number >> ");
        num = keyboard.nextInt();
//Remove the Enter key that remains in the input buffer after the last  numeric entry
        keyboard.nextLine();
        System.out.print("Enter first name >> ");
        firstName = keyboard.nextLine();
        System.out.print("Enter last name>> ");
        lastName = keyboard.nextLine();
        System.out.print("Enter salary >> ");
        salary = keyboard.nextDouble();
        keyboard.nextLine();
        emp.setEmpNum(num);
        emp.setEmpFirstName(firstName);
        emp.setEmpLastName(lastName);
        emp.setEmpSalary(salary);
        return emp;
    }
}