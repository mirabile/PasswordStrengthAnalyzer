/**
 * @(#)PasswordTooShortException.java
 *
 *
 * @author 
 * @version 1.00 2013/3/25
 */

package Exceptions;

public class PasswordTooShortException extends PasswordLengthException{
	String detailedMessage;
    public PasswordTooShortException(String illegalPassword){
    	super("");
    	detailedMessage = getClass().getName() + ": Password too short (< 6 characters): " + illegalPassword;
    }
    
    public String toString(){
    	return detailedMessage;	
    }
}