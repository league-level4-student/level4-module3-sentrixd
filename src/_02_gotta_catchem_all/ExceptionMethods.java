package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	double divide(double x1, double x2) throws IllegalArgumentException {
		if (x2 == 0.0) {
			throw new IllegalArgumentException();
		}
		
		return x1/x2;
	}
	
	String reverseString(String s) throws IllegalStateException {
		char[] convertedString = s.toCharArray();
		String newString = "";
		
		for (int i = convertedString.length - 1; i >= 0; i--) {
			newString = newString + convertedString[i];
		}
		
		if (s.equals("") || s.equals(null)) {
			throw new IllegalStateException();
		}
		
		System.out.println(newString);
		
		return newString;
	}
}
