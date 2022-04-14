package findintersection;

public class Main {
	public static String FindIntersection(String[] strArr) {

		/*
		 * return comma-separated string containing the numbers that occur in elements
		 * of strArr in sorted order. If there is no intersection, return the string
		 * false.
		 */

		String str1 = strArr[0]; // can't split here because strArr is a string array and str1 is a string
		String str2 = strArr[1];
		String result = "";
		
		for(String num : str1.split(", ")) {
			for(String num2 : str2.split(", ")) {
				if(num.equals(num2)) {
					if(result.length() == 0) {
						result += num;
					} else {
						result += "," + num;						
					}
//					System.out.println(result);
				}
				
			}
		}
		if(result.isEmpty()) {
			return "false";
		}
		return result;

	}

	public static void main(String[] args) {
		// keep this function call here
//	    Scanner s = new Scanner();
		System.out.print(FindIntersection(new String[] {"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"}));
	}
}
