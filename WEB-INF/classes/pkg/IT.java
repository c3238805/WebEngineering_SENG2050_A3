package pkg;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = {"/IT"})
public class IT extends HttpServlet{

	
	public void doGet (HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException {
       
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/jsp/ITLoginPage.jsp");
        dispatcher.forward(request, response);
    }

    public void doPost (HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException {
        PrintWriter out = response.getWriter();
        
        HttpSession session=request.getSession(true); 

        if(request.getParameter("itusername") !=null && request.getParameter("itpassword")!=null){
            session.setAttribute("itusername",request.getParameter("itusername"));
            session.setAttribute("itpassword",request.getParameter("itpassword"));
            
        }
        // need to be implement somthing here
        

    
    }
}

            
