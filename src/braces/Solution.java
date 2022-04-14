package braces;

import java.util.*;
import java.util.Scanner;

// Write your code here. DO NOT use an access modifier in your class declaration.
class Parser{
    static String isBalanced(String s) 
    
    {
        // balanced:
        // 1. string is empty
        // 2. a and b  = balanced then ab = balanced
        // a = balanced; (a) and {a} = balanced
        
    	String s = ;
    }
    
}

class Solution {
	
	public static void main(String[] args) {
		Parser parser = new Parser();
        
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			System.out.print(sBalanced(new String ["{}()","{()}","({()})"]));
			System.out.print(FindIntersection(new String[] {"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"}));
		}
        
		in.close();
	}
}
