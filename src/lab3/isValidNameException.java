/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author John
 */
public class isValidNameException extends Exception{
private static final String MSG = "Sorry, But your name is not Valid!!!";
    public isValidNameException() {
        super(MSG);
    }
    

    public isValidNameException(String message) {
        super(MSG);
    }

    public isValidNameException(String message, Throwable cause) {
        super(MSG,cause);
    }

    public isValidNameException(Throwable cause) {
        super(MSG,cause);
    }
    
    
    
    
}
