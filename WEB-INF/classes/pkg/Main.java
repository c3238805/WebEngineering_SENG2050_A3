package pkg;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = {"/Main"})
public class Main extends HttpServlet{
	
	public void doGet (HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException {
        
        // when user fist enter the main , show the login page for login
        HttpSession session=request.getSession(true);
        if(session.getAttribute("username") != null && session.getAttribute("password") != null){
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/jsp/MainPage.jsp");
            dispatcher.forward(request, response);
        }
        else {            
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/jsp/LoginPage.jsp");
            dispatcher.forward(request, response);
        }
        
    }

    public void doPost (HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException {
        HttpSession session=request.getSession(true); 
        if(request.getParameter("username") !=null && request.getParameter("password")!=null){
            session.setAttribute("username",request.getParameter("username") );
            session.setAttribute("password",request.getParameter("password"));

        }  
        
        // initial ReportManager
        ReportManager manager = new ReportManager();    
        session.setAttribute("manager",manager);
        
        //after the user is validated, create an new session for user
        if( manager.checkusername(session.getAttribute("username").toString(),session.getAttribute("password").toString()) == true){    // validate user name and password 
            // create new session after validate the user 
                             
            User newLogin = new User();
            session.setAttribute("newLogin",newLogin);
            newLogin.setUserName(session.getAttribute("username").toString());
            newLogin.setPassword(session.getAttribute("password").toString());
            session.setAttribute("newLogin",newLogin);
            session.setAttribute("username",newLogin.getUserName());
            session.setAttribute("password",newLogin.getPassword());
            
        }
        else if(manager.checkusername(session.getAttribute("username").toString(),session.getAttribute("password").toString()) != true && (request.getParameter("Register")==null)) {  // if input username and password is incorrect , direct back to login page 
            session.setAttribute("errorLogin","Invalid user name or password !");
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/jsp/LoginPage.jsp");
            dispatcher.forward(request, response);
            request.getSession().invalidate();
        }
        else {
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/jsp/LoginPage.jsp");
            dispatcher.forward(request, response);
            request.getSession().invalidate();
        }

        if (request.getParameter("LogOut")!=null){
            // destroy session 
            request.getSession().invalidate();
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/jsp/LoginPage.jsp");
            dispatcher.forward(request, response);
            
        }
        if(request.getParameter("ReportIssue")!=null){
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/jsp/Report.jsp");
            dispatcher.forward(request, response);
        }
        if(request.getParameter("Register")!=null){ // when the user want to Register
            String Registerusername = request.getParameter("Registerusername") ;
            String Registerpassword = request.getParameter("Registerpassword") ;
            String firstname = request.getParameter("firstname") ;
            String surname = request.getParameter("surname") ;
            String email = request.getParameter("email") ;
            String contact = request.getParameter("contact") ;


            manager.Register(Registerusername,Registerpassword,firstname,surname,email,contact);
// need to show the succesful messege
            request.getSession().invalidate();
               
        }
        
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/jsp/MainPage.jsp");
        dispatcher.forward(request, response);
    }

}

            
