package net.juniper.calc.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import static org.mockito.MockitoAnnotations.initMocks;

public class CalcAppServiceImplTest {
	
    @Before
    public void setup() {
    	initMocks(this);
    }
		
	@InjectMocks
	private CalcAppServiceImpl calc;
	
	@Test
	public void testAddition() {
		int no1 = 100;
		int no2 = 50;
		
		int sum = calc.addition(no1, no2);
		assertEquals(150, sum);
	}
	
	@Test
	public void testSub() {
		int no1 = 100;
		int no2 = 50;
		
		int sub = calc.substraction(no1, no2);
		assertEquals(50, sub);
	}

}
