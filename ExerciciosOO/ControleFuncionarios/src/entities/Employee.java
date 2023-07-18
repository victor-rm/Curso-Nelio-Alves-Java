package entities;

public class Employee {
    public String name;
    public double GrossSalary;
    public double tax;

    public double NetSalary() {
		return this.GrossSalary - this.tax;
    }
    public void IncreaseSalary(double percentage) {
        GrossSalary = (this.GrossSalary * (percentage / 100) + GrossSalary);
    }

}
