package upm.IWVG.SwC.Eneas;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;


public class FractionTest extends TestCase {

	 private Fraction fr;
		
	    @Before
	    public void setUp() {
	        fr = new Fraction(10, 2);
	    }
		
		@Test
		public void testFractionIntInt() {
			assertEquals(10, fr.getNumerator());
	        assertEquals(2, fr.getDenominator());
		}

		@Test
		public void testFraction() {
			fr = new Fraction();
	        assertEquals(1, fr.getNumerator());
	        assertEquals(1, fr.getDenominator());
		}

		@Test
		public void testDecimal() {
			assertEquals(5, fr.getNumerator() / fr.getDenominator());
		}

		@Test
		public void testGetNumerator() {
			assertEquals(10, fr.getNumerator());
		}

		@Test
		public void testGetDenominator() {
			assertEquals(2, fr.getDenominator());
		}

		@Test
		public void testSubtraction(){
	    	Fraction fraction = new Fraction(3,2);
	    	assertEquals(new Fraction(1,2).decimal(), fraction.subtraction(new Fraction(2,2)).decimal(), 0.01);
	    }

		@Test
		public void testSum(){
	    	Fraction fraction = new Fraction(3,2);
	    	assertEquals(new Fraction(5,2).decimal(), fraction.sum(new Fraction(2,2)).decimal(), 0.01);
		}
}
