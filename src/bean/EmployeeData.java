package bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeData {
    @Id
    @Column(name = "employee_id", nullable = false)
    private int employeeId;
    @Column(name = "employee_name",nullable = false)
    private EmployeeName employeeName;
    @Column(name = "employee_salary",nullable = false)
    private double employeeSalary;

    public EmployeeData() {
    }

    public EmployeeData(int employeeId, EmployeeName employeeName, double employeeSalary) {
        super();
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
}
