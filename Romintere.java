package veer.com;


	import java.util.HashMap;

	public class Romintere {
	    public static int romanToInt(String s) {
	        // Create a HashMap to store the values of Roman numerals
	        HashMap<Character, Integer> romanMap = new HashMap<>();
	        romanMap.put('I', 1);
	        romanMap.put('V', 5);
	        romanMap.put('X', 10);
	        romanMap.put('L', 50);
	        romanMap.put('C', 100);
	        romanMap.put('D', 500);
	        romanMap.put('M', 1000);

	        int result = 0;
	        int prevValue = 0;

	        // Iterate through the Roman numeral string from right to left
	        for (int i = s.length() - 1; i >= 0; i--) {
	            int value = romanMap.get(s.charAt(i));

	            if (value < prevValue) {
	                // If the current numeral is smaller than the previous one, subtract its value
	                result -= value;
	            } else {
	                // Otherwise, add its value
	                result += value;
	            }

	            prevValue = value;
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        String romanNumeral = "IX"; // Replace with your Roman numeral input
	        int result = romanToInt(romanNumeral);
	        System.out.println("The integer equivalent of " + romanNumeral + " is: " + result);
	    }
	}


