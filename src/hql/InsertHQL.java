package hql;

import bean.Employee;
import bean.EmployeeData;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class InsertHQL {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("resources/hibernate.cfg.xml");
        configuration.addAnnotatedClass(Employee.class);
        configuration.addAnnotatedClass(EmployeeData.class);  // This is for insert HQL only.
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        String hql = "insert into EmployeeData (employeeId, employeeName, employeeSalary)" +
                     "select employeeId, employeeName, employeeSalary from Employee";
        Query query = session.createQuery(hql);
        int row = query.executeUpdate();
        transaction.commit();
        System.out.println("Number of rows affected : " + row);
        session.close();
        sessionFactory.close();
    }
}
