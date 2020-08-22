package tut_4;

import org.junit.Test;
import static org.junit.Assert.assertEquals; 

public class CalcTest {
	@Test
	public void testCalcAdd() {
		int num1 = 1, num2 = 2, num3 = num1 + num2; 
		assertEquals(Calc.Add(num1, num2), num3);
	}
}

