/**
 * @(#)PasswordTooLongException.java
 *
 *
 * @author 
 * @version 1.00 2013/3/25
 */

package Exceptions;

public class PasswordTooLongException extends PasswordLengthException{
	String detailedMessage;
    public PasswordTooLongException(String illegalPassword){
    	super("");
    	detailedMessage = getClass().getName() + ": Password too long (> 6 characters): " + illegalPassword;
    }
    
    public String toString(){
    	return detailedMessage;	
    }
}