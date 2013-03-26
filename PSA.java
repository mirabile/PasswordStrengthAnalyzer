/**
 * @(#)PSA.java
 *
 *
 * @author 
 * @version 1.00 2013/3/24
 */

import Exceptions.*;
import java.util.Scanner;

public class PSA {
	
	public static final int MIN_LENGTH = 6;
	public static final int MAX_LENGTH = 12;
	public static final char[] SYMBOLS = {' ', '.', ':', '/', '!', '@', '#', '$', '%', '^', '&', '*', '–', '+', '=', '~'};
	public static final String[] ILLEGAL_PASSWORDS = {"123456",
											"12345",
											"123456789",
											"abc123",
											"password",
											"iloveyou",
											"princess",
											"rockyou",
											"1234567",
											"12345678",
											"Alex",
											"Daniel",
											"babygirl",
											"lovely",
											"654321",
											"111111",
											"qwerty",
											"soccer",
											"monkey",
											"password1"};
	
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		String password;
		
		do{
			System.out.print("Enter a password (\"\" to quit): ");
			password = scan.nextLine();
			
			try{
			if(password.length() < MIN_LENGTH)
				throw new PasswordTooShortException(password);
			else if(password.length() > MAX_LENGTH)
				throw new PasswordTooLongException(password);
				
			if(isIllegalPassword(password))
				throw new IllegalPasswordException(password);
			
			if(!hasDigit(password))
				throw new MissingDigitException(password);
			
			if(!hasLowerCase(password))
				throw new MissingLowerCaseLetterException(password);
			
			if(!hasUpperCase(password))
				throw new MissingUpperCaseLetterException(password);
			
			if(!hasSymbol(password))
				throw new MissingSymbolException(password);
				
			if(hasIllegalSymbol(password))
				throw new IllegalSymbolException(password);
			
			}catch(Exception e){
				System.out.println(e);
			}
			System.out.println();
		}while(!password.equals(""));

	}
	
	static boolean isIllegalPassword(String password){
		for(int i = 0; i < ILLEGAL_PASSWORDS.length; i++)
			if(password.equals(ILLEGAL_PASSWORDS[i]))
				return true;
				
		return false;
	}
	
	static boolean hasDigit(String password){
		for(int i = 0; i < password.length(); i++)
			if(Character.isDigit(password.charAt(i)))
				return true;
				
		return false;
	}
	
	static boolean hasLowerCase(String password)
	{
		for(int i = 0; i < password.length(); i++)
			if(Character.isLowerCase(password.charAt(i)))
				return true;
				
		return false;
	}
	
	static boolean hasUpperCase(String password)
	{
		for(int i = 0; i < password.length(); i++)
			if(Character.isUpperCase(password.charAt(i)))
				return true;
				
		return false;
	}
	
	static boolean hasSymbol(String password)
	{
		for(int i = 0; i < password.length(); i++)
			if(isSymbol(password.charAt(i)))
				return true;
				
		return false;
	}
	
	static boolean isSymbol(char c)
	{
		for(int i = 0; i < SYMBOLS.length; i++)
			if(c == SYMBOLS[i])
				return true;
				
		return false;
	}
	
	static boolean hasIllegalSymbol(String password){
		for(int i = 0; i < password.length(); i++)
			if(isIllegalSymbol(password.charAt(i)))
				return true;
				
		return false;
	}
	
	static boolean isIllegalSymbol(char c){
		if(Character.isLetter(c) || Character.isDigit(c))
			return false;
		
		for(int i = 0; i < SYMBOLS.length; i++)
			if(c == SYMBOLS[i])
				return false;
				
		return true;
	}
}