package firstreverse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static String FirstReverse(String str) {
		/* version 1 */
//		String newStr = "";
//		
//        for (int i = str.length()-1; i > str.indexOf(0); i--) { // start from the last index and traverse through the string
//            newStr += str.charAt(i); // add value into newStr
//        }
//	    return newStr;
		
		/* version 2 */
//		String nstr = ""; 
//		char ch;
//
//		for (int i = 0; i < str.length(); i++) {
//			ch = str.charAt(i); // extracts each character
//			System.out.println("24"+ch);
//			nstr = ch + nstr; // adds each character in front of the existing string
//			System.out.println("26"+nstr);
//		}
//		return nstr;
		/* version 3 */
		return new StringBuilder(str).reverse().toString();
	    
	}

	

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner("coderbyte");
		System.out.print(FirstReverse(s.nextLine()));
	}
}
