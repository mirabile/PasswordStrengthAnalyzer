/**
 * @(#)MissingSymbolException.java
 *
 *
 * @author 
 * @version 1.00 2013/3/25
 */

package Exceptions;

public class MissingSymbolException extends MissingCharacterTypeException{
	String detailedMessage;
    public MissingSymbolException(String illegalPassword){
    	super("");
    	detailedMessage = getClass().getName() + ": Password must have at least one symbol: " + illegalPassword;
    }
    
    public String toString(){
    	return detailedMessage;	
    }
}