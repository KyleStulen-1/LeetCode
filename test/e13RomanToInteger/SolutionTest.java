package e13RomanToInteger;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {
	Solution solution;
	
	@BeforeEach
	void setUp() {
		solution = new Solution();
	}
	
	@Test
	void test3() {
		assertEquals(solution.romanToInt("III"),3);
	}
	
	@Test
	void test58() {
		assertEquals(solution.romanToInt("LVIII"), 58);
	}

	@Test
	void test1494() {
		assertEquals(solution.romanToInt("MCMXCIV"), 1994);
	}
}
