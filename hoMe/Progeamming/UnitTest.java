package Progeamming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTest {

	@Test
	void test() {
		MyClass test = new MyClass();
		assertEquals("EQUILATERAL", test.triangle(3, 3, 3));
		assertEquals("ISOSCELES", test.triangle(3, 3, 4));
		assertEquals("SCALENE", test.triangle(3, 4, 5));
		assertEquals("NOT A TRIANGLE", test.triangle(3, 4, 7));
		assertEquals("INVALID INPUT", test.triangle(0, 3, 3));
	    
	}
	}