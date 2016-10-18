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
public class IllegalCharException extends IllegalArgumentException {
    private final static String MSG = "Please enter a name without special characters";
    
    public IllegalCharException(){
        super(MSG);
    }
    
    public IllegalCharException(String message){
        super(message);
    }
   
}
