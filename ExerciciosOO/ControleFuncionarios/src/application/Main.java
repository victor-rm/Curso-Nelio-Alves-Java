package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();

        System.out.print("Gross Salary: ");
        employee.GrossSalary = sc.nextDouble();

        System.out.println("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.printf("Employee: %s, $ %.2f\n", employee.name, employee.NetSalary());

        System.out.print("Which percentage to increase salary? ");
        employee.IncreaseSalary(sc.nextDouble());

        System.out.printf("Updated data: %s, $ %.2f", employee.name, employee.NetSalary());

        sc.close();
    }
}