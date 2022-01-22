package pkg;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = {"/ReportIssue"})
public class ReportIssue extends HttpServlet{

	
	public void doGet (HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException {
        
    }

    public void doPost (HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException {
        HttpSession session=request.getSession();

        String username = session.getAttribute("username").toString();

        String Category = request.getParameter("Category");
        String Network = request.getParameter("Network");
        String Software = request.getParameter("Software");
        String Hardware = request.getParameter("Hardware");
        String Email = request.getParameter("Email");
        String Account = request.getParameter("Account");
        String Description = request.getParameter("Description");
        //when the user submit an report, state is New by default
        String State = "New";

        // then store it into sql 
        ReportManager manager = (ReportManager) session.getAttribute("manager");
        manager.addReport(username, Category, Network, Software, Hardware, Email, Account, Description,State);

        // need to show messege then back to main page
        //
        //
        // back to main page
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/jsp/MainPage.jsp");
        dispatcher.forward(request, response);
    }

}

            
