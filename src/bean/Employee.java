package bean;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id", nullable = false)
    private int employeeId;
    @Column(name = "employee_name",nullable = false)
    private EmployeeName employeeName;
    @Column(name = "employee_salary",nullable = false)
    private double employeeSalary;

    public Employee() {
    }

    public Employee(int employeeId, EmployeeName employeeName, double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public EmployeeName getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(EmployeeName employeeName) {
        this.employeeName = employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + employeeId +
                ", " + employeeName +
                ", Salary=" + employeeSalary +
                '}';
    }
}
