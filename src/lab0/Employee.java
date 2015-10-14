package lab0;

import java.util.Date;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    public static final int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private Date hireDate;
    private int daysVacation;

    public Employee() {
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        hireDate = new Date();
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, Date hireDate, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        this.hireDate = hireDate;
        this.daysVacation = daysVacation;
    }
    
    public int getDaysVacation() throws IllegalArgumentException {
        if(daysVacation < -30 || daysVacation > 30){
            throw new IllegalArgumentException("Sorry vacation days must be between -30 and 30");
            
        }
        return daysVacation;
    }

    public void setDaysVacation(int daysVacation)throws IllegalArgumentException  {
        if(daysVacation < -30 || daysVacation > 30){
            throw new IllegalArgumentException("Sorry vacation days must be between -30 and 30");
            
        }
        this.daysVacation = daysVacation;
    }

    public String getFirstName() {
        return firstName;
    }

    /**
     * sets the optional first name
     * @param firstName - may not be null or empty
     * @throws IllegalArgumentException if first name is null or has a length of 0
     */
    public final void setFirstName(String firstName)throws IllegalArgumentException  {
       if(firstName == null || firstName.isEmpty()){
           throw new IllegalArgumentException("First Name cannot be null"); 
           
       }
        this.firstName = firstName;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        
        this.hireDate = hireDate;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName)throws IllegalArgumentException {
        if(lastName == null || lastName.isEmpty()){
           throw new IllegalArgumentException("Last Name cannot be null"); 
           
       }
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    // 333-33-3333
    // 333333333
    public void setSsn(String ssn) {
        if(ssn == null || ssn.isEmpty()){
            throw new IllegalArgumentException();
            
        }
        if(ssn.length()== 9 || ssn.length() == 11){
            String [] parts = ssn.split("-");
            if(parts.length == 0){
                char[] chars = ssn.toCharArray();
                throw new IllegalArgumentException();
            }else if(parts.length ==3){
                for(String s : parts){
                    char[] c = s.toCharArray();
                }
                
            }
            char[] chars = ssn.toCharArray();
        }else{
            throw new IllegalArgumentException();
        }
            
        this.ssn = ssn;
    }
    
    
    
}
