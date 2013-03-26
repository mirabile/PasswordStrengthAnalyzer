
/**
 * @(#)MissingLowerCaseException.java
 *
 *
 * @author 
 * @version 1.00 2013/3/25
 */
 
 package Exceptions;

public class MissingUpperCaseLetterException extends MissingLetterException{
	String detailedMessage;
    public MissingUpperCaseLetterException(String illegalPassword){
    	super("");
    	detailedMessage = getClass().getName() + ": Password must have at least one upper-case letter: " + illegalPassword;
    }
    
    public String toString(){
    	return detailedMessage;	
    }
}