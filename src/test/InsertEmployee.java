package test;

import bean.Employee;
import bean.EmployeeName;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertEmployee {
    public static void main(String[] args) {

        // Using setter methods
        Employee employee1 = new Employee();
        EmployeeName employee1Name = new EmployeeName();
        employee1.setEmployeeId(11);
        employee1Name.setFirstName("John");
        employee1Name.setMiddleName("Kumar");
        employee1Name.setLastName("Deshmukh");
        employee1.setEmployeeName(employee1Name);
        employee1.setEmployeeSalary(99000.99);

        // Using parameterized constructor
        Employee employee2 = new Employee(12,new EmployeeName("Harshada", "Ganesh", "Bonde"), 88670.56);
        Employee employee3 = new Employee(13,new EmployeeName("Rahul", "Suresh", "Sharma"), 77670.22);
        Employee employee4 = new Employee(14,new EmployeeName("Disha", "Mahesh", "Joshi"), 66670.34);
        Employee employee5 = new Employee(15,new EmployeeName("Rutuja", "Raju", "Pande"), 55670.12);

        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Employee.class);
        configuration.configure("resources/hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(employee1);
        session.save(employee2);
        session.save(employee3);
        session.save(employee4);
        session.save(employee5);

        transaction.commit();
        session.evict(employee1);
        session.close();
        sessionFactory.close();
    }
}