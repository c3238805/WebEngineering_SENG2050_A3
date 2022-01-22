package pkg;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;

@WebListener
public class MyContextListener implements ServletContextListener{
    

    @Override
    public void contextInitialized(ServletContextEvent sce){
        ServletContext ctx = sce.getServletContext();
        // messege for testing purpose .
        System.out.println("Context Created ! ");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce){
        ServletContext ctx = sce.getServletContext();

        // destroy the session when destroying the context
        
    
        // messege for testing purpose .
        System.out.println("Context Destroyed ! ");
    }
}
