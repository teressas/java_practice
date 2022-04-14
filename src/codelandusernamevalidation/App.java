package codelandusernamevalidation;

import java.util.Scanner;
import java.util.*;
import java.io.*;

public class App {

	public static boolean CodelandUsernameValidation(String str) {
		/*
		1. The username is between 4 and 25 characters.
		2. It must start with a letter.
		3. It can only contain letters, numbers, and the underscore character.
		4. It cannot end with an underscore character.

		If the username is valid then your program should return the string true, otherwise return the string false.
		*/
		if (str.length() < 4 || str.length() > 25) {
			System.out.println("Failed length");
			return false;
		}
		if(str.charAt(str.length() - 1) == '_') {
			System.out.println("Failed last character");
			return false;
		}
		if(!Character.isLetter(str.charAt(0))) {
			System.out.println("Failed first char");
			return false;
		}
		for(int i=0; i<str.length(); i++)
		{
			if(!Character.isLetterOrDigit(str.charAt(i)) && str.charAt(i) != '_') {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner("aaa2");
		System.out.print(CodelandUsernameValidation(s.nextLine()));
	}

}
