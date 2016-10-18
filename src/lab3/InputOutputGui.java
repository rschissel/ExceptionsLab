package lab3;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation(NameValidator val)throws Exception {
        
        String fullName = JOptionPane.showInputDialog("Enter full name:");
        String lastName = null;
        try{
        lastName = nameService.extractLastName(fullName, val);
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
        }
        catch (IllegalCharException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        catch (NameLengthException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }
     
}
