package com.training;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TestGreeting {
    Greeting obj;
    
    @BeforeAll
    public static void init() {
    	System.out.println("Before All called");
    }
    
    @BeforeEach
    public void setUp() {
    	System.out.println("Before each is called");
    	obj=new Greeting();
    }
	@Test
	@DisplayName(value="To test the method to return string of length less than 10")
	void testforGetMessage() {
		 
		int actual=obj.getMessage().length();
		int expected=10;
		assertTrue(actual>expected);
		//assertEquals(expected,actual);
	}
	
	@Test
	void testAssignTest() {
		String actual=obj.assignGrade(40);
		String expected="b";
		
		assertEquals(expected,actual);	
	}
	
	@Test
	void testParseMethod() {
		assertThrows(NumberFormatException.class,() -> obj.parse("fifty"));
		
	}
	
	//@Disabled ("will wait for bug fixes on other methods to complete")
	
	@ParameterizedTest
	@ValueSource(ints= {0,1,3})
	void testGetBestBook(int idxpos) {
		//LocalDate currentDate=LocalDate.now();
		//assumeTrue(currentDate.getDayOfWeek().equals(DayOfWeek.TUESDAY));
		assertNotNull(obj.getBestBook(idxpos));
	}
	
	@AfterEach
	void tearDown() {
		System.out.println("After Each is  called");
		
	}
	
	@AfterAll
    public static void destroy() {
    	System.out.println("Afer ALL IS CALLED");
    }

}
