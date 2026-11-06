import java.util.*;
import java.io.*;

public abstract class User implements Serializable, HasMenu {
  
  String userName = "";
  string PIN = "";

  public void setUserName(String userName){
    this.userName = userName;
  } // end of setUserName
  
  public String getusername(){
    return this.userName;
  } // end of getUserName
  
  public void setPIN(String PIN){
    this.PIN = PIN;
  } // end of setPIN
  
  public String getPIN(){
    return this.PIN;
  } // end of getPIN

  public boolean login(String userNameInput, String pinInput){
    boolean result = false;
    if (userNameInput.equals(this.userName)){
      if (pinInput.equals(this.PIN)){
        result = true;
      } // end of if (pin)
    } // end of if (user)
    return result;
  } // end of login

  public boolean login(){
    Scanner input = new Scanner(System.in);
    boolean result = false;
    System.out.print("Username: ");
    String userNameInput = input.nextLine();
    if (userNameInput.equals(this.userName)){
      System.out.print("PIN: ");
      String pinInput = input.nextLine();
      if (pinInput.equals(this.PIN){
        System.out.println("  Login successful.");
	result = true;
      } else {
        System.out.println("  Incorrect PIN...");
      } // end of if (pin)
    } else {
      System.out.println("  Incorrect Username...");
    } // end of if (username)
  } // end of login

} // end of User
