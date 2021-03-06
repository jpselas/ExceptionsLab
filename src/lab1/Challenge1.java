package lab1;

import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using
 * Java Exception handling techniques.
 * <p>
 * Your challenge is to consider all the possible things that can go wrong
 * with this program and use exception handling where appropriate to prevent
 * the program from crashing. In addition you must display a friendly error
 * message in a JOptionPane and ask the user to try again. (Yes, this violates 
 * the Single Responsibility Principle, but for this lab, we'll overlook that.)
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {
    private static final int LAST_NAME_IDX = 1;

    public static void main(String[] args) {
        
        Challenge1 app = new Challenge1();
       
        String firstName = JOptionPane.showInputDialog("Enter first name: ");
        if(firstName.isEmpty()){
            firstName = JOptionPane.showInputDialog("Sorry you must enter a First name, Please Try Again");
            if(firstName.isEmpty()){
                throw new IllegalArgumentException(JOptionPane.showInputDialog("Sorry you must enter a First name, Please Try Again Later"));
                
            }
        }
        
        String lastName = JOptionPane.showInputDialog("Enter last name: ");
        if(lastName.isEmpty()){
            lastName = JOptionPane.showInputDialog("Sorry you must enter a Last name, Please Try Again");
            if(lastName.isEmpty()){
                throw new IllegalArgumentException(JOptionPane.showInputDialog("Sorry you must enter a Last name, Please Try Again Later"));
                
            }
        }
       
        
        
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
    
    }
    public String extractLastName(String lastName) {
        
        
        return lastName;
    }
    
    
}
