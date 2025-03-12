package hql;

import bean.Employee;
import bean.EmployeeName;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class OrderByHQL {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Employee.class);
        configuration.addAnnotatedClass(EmployeeName.class);
        configuration.configure("resources/hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        String hql = "from Employee order by employeeSalary";
        Query query = session.createQuery(hql);
        List<Employee> employeeList = query.list();
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
        session.close();
        sessionFactory.close();
    }
}
