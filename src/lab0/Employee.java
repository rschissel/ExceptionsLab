package lab0;

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
    private String format = "\\d{3}-\\d{2}-\\d{4}";
    private int daysVacation;
    String[] illegalChars = new String[]{"!", "@", "$", "%", "^", "*", "(", ")",
            "+", "[", "]", "{", "}", "|", "\'", "\"", "\\", "/", "<", ">", ".",
            ",", ":", ";"};
    public Employee() {
        // initialize a bunch of default values
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        setDaysVacation(daysVacation);
    }
    
    public int getDaysVacation() {
        return daysVacation;
    }
    //Validation rules
    //- minimum >= 0
    //--maximum <= 120
    public void setDaysVacation(int daysVacation) {
        if (daysVacation < 0 || daysVacation > 120){
            throw new IllegalArgumentException("Please enter a number of vacation days that is between 0 and 120");
        }
        this.daysVacation = daysVacation;
    }

    public String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
       for (int i =0; i < illegalChars.length; i++){
            if (firstName.equals(null) || firstName.contains(illegalChars[i])){
                throw new IllegalArgumentException("Please enter a valid first name");
            }
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    //Validation rules
    //no nulls
    //no empty string
    //no special symbols
    //length minimum = 1
    //length maximum = 50
    public void setLastName(String lastName) {
        for (int i =0; i < illegalChars.length; i++){
            if (lastName.equals(null) || lastName.contains(illegalChars[i])){
                throw new IllegalArgumentException("Please enter a valid last name");
            }
        }
        
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }
    
    public void setSsn(String ssn) {
        if(!ssn.matches(format)){
            throw new IllegalArgumentException("Please enter a valid Social Security number");
        }
        this.ssn = ssn;
    }
    
    
}
