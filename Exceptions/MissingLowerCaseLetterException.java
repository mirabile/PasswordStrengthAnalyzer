/**
 * @(#)MissingLowerCaseException.java
 *
 *
 * @author 
 * @version 1.00 2013/3/25
 */

package Exceptions;

public class MissingLowerCaseLetterException extends MissingLetterException{
	String detailedMessage;
    public MissingLowerCaseLetterException(String illegalPassword){
    	super("");
    	detailedMessage = getClass().getName() + ": Password must have at least one lower-case letter: " + illegalPassword;
    }
    
    public String toString(){
    	return detailedMessage;	
    }
}