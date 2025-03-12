package hql;

import bean.Employee;
import bean.EmployeeName;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class UpdateHQL {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("resources/hibernate.cfg.xml");
        configuration.addAnnotatedClass(Employee.class);
        configuration.addAnnotatedClass(EmployeeName.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        /*String hql = "update Employee set employeeSalary = 80000.99 where employeeId = 101";
        Query query = session.createQuery(hql);
        int row = query.executeUpdate();
        transaction.commit();
        System.out.println("Number of rows affected : " + row);*/

        /*String hql = "update Employee set employeeSalary = : salary " + "where employeeId = : id";
        Query query = session.createQuery(hql);
        query.setParameter("salary", 65400.99);
        query.setParameter("id", 103);
        int row = query.executeUpdate();
        transaction.commit();
        System.out.println("Number of rows affected : " + row);*/

        String hql = "update Employee set firstname = 'Vaidehi', middlename = 'Viraj', lastname = 'Sahrma' where employeeId = 105";
        Query query = session.createQuery(hql);
        int row = query.executeUpdate();
        transaction.commit();
        System.out.println("Number of rows affected : " + row);

        session.close();
        sessionFactory.close();
    }
}
