package sam.example;




import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
    	
	      
	      Configuration config=new Configuration();
	     // config.addAnnotatedClass(sam.example.Employee.class);
	      config.configure("hibernate.cfg.xml");
	      
	      SessionFactory factory= config.buildSessionFactory();
	      
	      Session session =factory.openSession();
	      
	      Transaction transaction=session.beginTransaction();
	      Employee e=new Employee(104,"ravi","ph");
	    	
//	      e.setAid(102);
//	      e.setAname("prasa");
//	      e.setTech("python");
	      session.persist(e);
	      transaction.commit();
	      
	      
	      
	      
    }
    
    
}
