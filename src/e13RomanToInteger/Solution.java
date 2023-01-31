package e13RomanToInteger;

import java.util.Map;

public class Solution {
	
	public Map<String, Integer> numerals = Map.of(
			"I", 1, 
			"V", 5,
			"X", 10, 
			"L", 50, 
			"C", 100, 
			"D", 500,
			"M", 1000
			);
	
	public int romanToInt(String s) {
		int sum = 0;
		for (int i = 0; i < s.length()-1; i++) {
			if (numerals.get(s.substring(i, i+1)) >= numerals.get(s.substring(i+1, i+2))) {
				sum += numerals.get(s.substring(i, i+1));
			} else {
				sum -= numerals.get(s.substring(i, i+1));
			}
		}
		
		sum += numerals.get(s.substring(s.length() - 1));
		
		return sum;
	}
}
