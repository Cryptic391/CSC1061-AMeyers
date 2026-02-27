package edu.frcc.csc1061j.Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class CalculatorTest {
	
	Calculator calc;
	
	@BeforeEach
	void setup() {
		calc = new Calculator();
	}
	
	@Test
	@DisplayName("Simple Addition")
	void testAdd() {
		assertEquals(10, calc.add(8, 2), "Addition not working");
	}
	
	@Test
	@DisplayName("Simple Multiplication")
	void testMultiply() {
		assertEquals(20, calc.multiply(4, 5), "Multiply not work");
		assertTrue(calc.multiply(3, 6)==18, "answer should be 18");
	}
	
	@Test
	@DisplayName("Simple Divide")
	void testDivide() {
		assertEquals(3.0, calc.divide(6,2), "Divide not work");
	}
	
	@Test
	@DisplayName("Divide by 0")
	void testDivideExeption() {
		ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calc.divide(1, 0));
		assertEquals("Cannot divide by 0", exception.getMessage());
		
	}

}
