package pkg;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.sql.*;
import java.sql.*;
import java.util.*;
import java.io.*;
import javax.servlet.annotation.WebListener;

@WebListener
public class MySessionListener implements HttpSessionListener{
    private  int totalActiveSessions;
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        totalActiveSessions++;
        System.out.println("Session Created ! Current session: "+totalActiveSessions);
    }
    
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        totalActiveSessions--;    
        System.out.println("End session ! Current session: "+ totalActiveSessions);
        

    }
}
