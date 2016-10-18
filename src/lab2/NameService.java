package lab2;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
    
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     * @throws IllegalArgumentException if fullName is null or empty or has 
     * fewer than two parts
     */
    private NameValidator val;

    public String extractLastName(String fullName, NameValidator val) throws Exception {
        String lastName = null;
        String[] names = fullName.split(" ");

        if (names.length < 2 || !val.validateFullNameHasNoIllegalChars(fullName)) {
            throw new IllegalArgumentException("Invalid name entered");
        } else {
            lastName = names[names.length - 1];
            return lastName;
        }

    }
   
}
