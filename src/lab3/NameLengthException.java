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
public class NameLengthException extends IllegalArgumentException{
     private final static String MSG = "A valid name has 2 parts.";
    
    public NameLengthException(){
        super(MSG);
    }
    
    public NameLengthException(String message){
        super(message);
    }
}
