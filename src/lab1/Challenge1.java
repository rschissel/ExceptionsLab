package lab1;

import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using Java
 * Exception handling techniques.
 * <p>
 * Your challenge is to consider all the possible things that can go wrong with
 * this program and use exception handling where appropriate to prevent the
 * program from crashing. In addition you must display a friendly error message
 * in a JOptionPane and ask the user to try again. (Yes, this violates the
 * Single Responsibility Principle, but for this lab, we'll overlook that.)
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {

    private static final int LAST_NAME_IDX = 1;

    public static void main(String[] args) {
        Challenge1 app = new Challenge1();
        String lastName = null;
        String fullName = JOptionPane.showInputDialog("Enter full name (use Format: first last):");
        try {
            lastName = app.extractLastName(fullName);
            String msg = "We think your last name is: " + lastName;
            JOptionPane.showMessageDialog(null, msg);
        } catch (IllegalArgumentException iae) {
            JOptionPane.showMessageDialog(null, iae.getMessage());
        }

    }

    // write the code to extract the lastName from the fullName nb 
    // Use exception handling to prevent a crash in the event that fullName
    // is null or empty. Throw the exception to the calling method. and handle
    // it there.
    public String extractLastName(String fullName) throws IllegalArgumentException {
        String lastName = null;
        String[] names = fullName.split(" ");
        
        if (names.length < 2 || !validate(fullName)) {
            throw new IllegalArgumentException("A valid name has 2 parts");
        }
        lastName = names[names.length - 1];
        return lastName;
    }

    public boolean validate(String input) {
        String[] illegalChars = new String[]{"!", "@", "$", "%", "^", "*", "(", ")",
            "+", "[", "]", "{", "}", "|", "\'", "\"", "\\", "/", "<", ">", ".",
            ",", ":", ";"};
        for (String illegalChar : illegalChars) {
            if (input.contains(illegalChar)){
                return false;
            }
        }
        return true;
    }

}
