/**
 * @(#)PasswordLengthException.java
 *
 *
 * @author 
 * @version 1.00 2013/3/25
 */

package Exceptions;

public class PasswordLengthException extends Exception{
    public PasswordLengthException(String errorMessage){
    	super(errorMessage);
    }
}