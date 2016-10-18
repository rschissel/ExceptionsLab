/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;
/**
 *
 * @author Ryan Schissel
 */
public class NameValidator {
    public final boolean validateFullNameHasNoIllegalChars(String input) {
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
    public final boolean validateFullNameHasMultipleParts(String[] names){
        if (names.length > 2){
            return true;
        }
        return false;
    }
}
