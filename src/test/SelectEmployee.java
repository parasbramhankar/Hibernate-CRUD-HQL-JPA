package test;

import bean.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SelectEmployee {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Employee.class);
        configuration.configure("resources/hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Employee employee = session.get(Employee.class, 101);
        System.out.println(employee.toString());
        session.close();
        sessionFactory.close();
    }
}
