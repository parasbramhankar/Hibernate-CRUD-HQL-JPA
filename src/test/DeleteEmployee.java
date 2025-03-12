package test;

import bean.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmployeeId(101);

        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Employee.class);
        configuration.configure("resources/hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.delete(employee);

        transaction.commit();
        session.close();
        sessionFactory.close();

    }
}
