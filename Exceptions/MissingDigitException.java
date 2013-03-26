/**
 * @(#)MissingDigitException.java
 *
 *
 * @author 
 * @version 1.00 2013/3/25
 */

package Exceptions;

public class MissingDigitException extends MissingCharacterTypeException{
    String detailedMessage;
    public MissingDigitException(String illegalPassword) {
    	super("");
    	detailedMessage = getClass().getName() + ": Password must have at least one digit: " + illegalPassword;
    }

    public String toString(){
    	return detailedMessage;	
    }
}