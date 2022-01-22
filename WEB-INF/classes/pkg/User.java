package pkg;

import java.io.Serializable;

public class User implements Serializable {
    String username;
    String password;
    
    
    public User(){
        username = "";
        password = "";           
    }
    public User(String username,String password){
        this.username = username;
        this.password = password;           
    }

    
    //==================== UserName getter and setter =====================
    public void setUserName(String username){
        this.username = username;
    }
    public String getUserName(){
        return username;
    }
    //==================== Password getter and setter =====================
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    //====================   =====================


}
