package hql;

import bean.Employee;
import bean.EmployeeName;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class SelectHQL {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Employee.class);
        configuration.configure("resources/hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        //  For all rows.
        /*String hql = "from Employee";
        Query query = session.createQuery(hql);
        List<Employee> employeeList = query.list();
        for (Employee emp:employeeList) {
            System.out.println(emp.toString());
        }*/

        // Single row.
        /*String hql = "from Employee where employeeid = 102";
        Query query = session.createQuery(hql);
        Employee employee = (Employee) query.uniqueResult();
        System.out.println(employee.toString());*/

        //  Single column from sequence
        /*String hql = "select employeeName from Employee";
        Query query = session.createQuery(hql);
        List<EmployeeName> fNames = query.list();
        for (EmployeeName name : fNames) {
            System.out.println("First Name : " + name.getFirstName());
        }*/

        //  Multiple column from sequence
        /*String hql = "select employeeName from Employee";
        Query query = session.createQuery(hql);
        List<EmployeeName> names = query.list();
        for (EmployeeName name : names) {
            System.out.println("First name : " + name.getFirstName());
            System.out.println("Last name : " + name.getLastName());
        }*/

        /*String hql = "select employeeId, employeeSalary from Employee";
        Query query = session.createQuery(hql);
        List<Object> employeeList = query.list();
        for (Object obj : employeeList) {
            Object[] objects = (Object[]) obj;
            System.out.println("Id : " + objects[0]);
            System.out.println("Salary : " + objects[1]);
        }*/

        /*String hql = "select employeeSalary from Employee";
        Query query = session.createQuery(hql);
        List<Double> employeeList = query.list();
        for (Double aDouble : employeeList) {
            System.out.println("Salary : " + aDouble);
        }*/

        String hql = "select employeeId, employeeName from Employee";
        Query query = session.createQuery(hql);
        List<Object> employees = query.list();
        for (Object employee : employees) {
            Object[] obj = (Object[]) employee;
            System.out.println("Id : " + obj[0]);
            System.out.println("Name : " + obj[1]);
        }


        session.close();
        sessionFactory.close();
    }
}
