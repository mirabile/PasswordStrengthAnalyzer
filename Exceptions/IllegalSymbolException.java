/**
 * @(#)IllegalSymbolException.java
 *
 *
 * @author 
 * @version 1.00 2013/3/25
 */

package Exceptions;

public class IllegalSymbolException extends Exception{
    String detailedMessage;
    public IllegalSymbolException(String illegalPassword){
    	super("");
    	detailedMessage = getClass().getName() + ": Illegal symbol: " + illegalPassword;
    }

    public String toString(){
    	return detailedMessage;	
    }
}