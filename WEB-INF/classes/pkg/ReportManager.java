package pkg;
import pkg.ConfigBean;  // ConfigBean.java created in pakage

import javax.sql.*;
import java.sql.*;
import java.util.*;
import java.io.*;

public class ReportManager implements Serializable{

    private boolean userexist = false;      // set userexist = false by default
    private String username;
    private String password;

    public boolean checkusername(String username,String password ){ 
        String query = "SELECT * FROM AllUser WHERE username = '"+username+"' and password = '"+password+"'";
        // get a connection from the class created as 'ConfigBean.java'
        try(Connection con = ConfigBean.getConnection();    //step1
           
            PreparedStatement ps = con.prepareStatement(query);         //step2
            //get result from execute the statement with the SELECT query
            ResultSet rs = ps.executeQuery();)  {      //step3
            
            if (rs.next()){     // make boolean exist = ture if rs.next() is true
                userexist = true;                                       
            }
            ps.close();  // close PreparedStatements
            con.close(); // close connection
        }
        catch(SQLException e){            
            System.err.println(e.getMessage());
            System.err.println(e.getStackTrace());
        }            
        return userexist;    

    }    

//=============================================================================
    public void Register(String Registerusername,String Registerpassword,String firstname,String surname,String email,String contact){
        // need to show the messege
        String massege = "Register Successful ";
        String query = "INSERT INTO AllUser VALUES (?,?,?,?,?,?); " ;  //insert 26 columns into sql 

        
        try(Connection con = ConfigBean.getConnection();    //step1
            
            PreparedStatement ps = con.prepareStatement(query);){ 
            ps.setString(1, Registerusername);
            ps.setString(2, Registerpassword);
            ps.setString(3, firstname);
            ps.setString(4, surname);
            ps.setString(5, email);
            ps.setString(6, contact);
            
            ps.executeQuery();
            ps.close();  
            con.close();    
        }
            
        catch(SQLException e){
            massege = e.getMessage()+" "+ e.getStackTrace();
            System.err.println(e.getMessage());
            System.err.println(e.getStackTrace());

        }
		// need to show the messege

    }

//================================================================================  

    public void addReport(String username,String Category,String Network,String Software,String Hardware,
                            String Email, String Account, String Description,String State){
        // need to show the messege
        //String massege = "Register Successful ";
        String query = "INSERT INTO ReportIssue VALUES (?,?,?,?,?,?,?,?,?); " ;  //insert 26 columns into sql        
        try(Connection con = ConfigBean.getConnection();    //step1
            
            PreparedStatement ps = con.prepareStatement(query);){ 
            ps.setString(1, username);
            ps.setString(2, Category);
            ps.setString(3, Network);
            ps.setString(4, Software);
            ps.setString(5, Hardware);
            ps.setString(6, Email);
            ps.setString(7, Account);
            ps.setString(8, Description);
            ps.setString(9, State);

            ps.executeQuery();
            ps.close();  
            con.close();    
        }
            
        catch(SQLException e){
            //massege = e.getMessage()+" "+ e.getStackTrace();
            System.err.println(e.getMessage());
            System.err.println(e.getStackTrace());

        }
		// need to show the messege

    }

/**  
//================================================================================  
    // this is to read data .
    public void read(String username,String passphrase ){    //String name,String passphase

    String query = "SELECT * FROM GAME WHERE username = '"+username+"' and passphrase = '"+passphrase+"'";
    // get a connection from the class created as 'ConfigBean.java'
    try(Connection con = ConfigBean.getConnection();    //step1
        //Create a statement 
        Statement sta = con.createStatement();          //step2
        //get result from execute the statement with the SELECT query
        ResultSet rs = sta.executeQuery(query);)  {      //step3

        while (rs.next()){
            
            username = rs.getString("username");
            passphrase = rs.getString("passphrase");

            for(int i=0;i<c.length;i++){
                caseFace[i] = rs.getString("case"+i+"Face"); //store sql case face into caseFace[]
                caseValue[i] = rs.getDouble("case"+i+"Value");
                c[i] = new Case(caseValue[i], caseFace[i]);
            }                    
                              
        }
        
        rs.close();
        sta.close();
        con.close();

    }
        catch(SQLException e){
            System.err.println(e.getMessage());
            System.err.println(e.getStackTrace());
        }

  }
//================================================================================  
// delete user data for new Game
public void deleteData(String username,String passphrase ){ 
    String query = "DELETE FROM GAME WHERE username = '"+username+"' and passphrase = '"+passphrase+"'";
    // get a connection from the class created as 'ConfigBean.java'
    try(Connection con = ConfigBean.getConnection();    //step1
        Statement sta = con.createStatement();          //step2
        ResultSet rs = sta.executeQuery(query);)  {      //step3        
        exist = false;  //set exist to false, cause data been deleted
        
        rs.close();
        sta.close();
        con.close();

    }
        catch(SQLException e){
            System.err.println(e.getMessage());
            System.err.println(e.getStackTrace());
        }
        
}



 */
//================================================================================  


    public void setUserName(String username){
        this.username = username;
    }
    public String getUserName(){
        return username;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    
    public void restuserexist(){
        userexist = false;
        
    }






    





}



