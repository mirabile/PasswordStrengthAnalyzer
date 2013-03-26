/**
 * @(#)IllegalPasswordException.java
 *
 *
 * @author 
 * @version 1.00 2013/3/25
 */

package Exceptions;

public class IllegalPasswordException extends Exception{
    String detailedMessage;
    public IllegalPasswordException(String illegalPassword){
    	super("");
    	detailedMessage = getClass().getName() + ": Illegal password: " + illegalPassword;
    }

    public String toString(){
    	return detailedMessage;	
    }
}