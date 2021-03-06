package upm.IWVG.SwC.Eneas;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;


public class DecimalCollectionTest extends TestCase {

	private DecimalCollection dc;

    @Before
    public void setUp() {
        this.dc = new DecimalCollection();
        this.dc.add(2.0);
        this.dc.add(-1.0);
        this.dc.add(3.0);
        this.dc.add(2.0);
    }

    @Test
    public void testDecimalCollection() {
        this.dc = new DecimalCollection();
        assertEquals(0, this.dc.size());
    }

    @Test
    public void testAdd() {
        assertEquals(4, this.dc.size());
    }

    @Test
    public void testSum() {
        assertEquals(6, this.dc.sum(), 10e-5);
    }

    @Test
    public void testHigher() {
        assertEquals(3, this.dc.higher(), 10e-5);
    }
    
    @Test
    public void testProduct() {
        assertEquals(-12, this.dc.product(), 10e-5);
    }

}
