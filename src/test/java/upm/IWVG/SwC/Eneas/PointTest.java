package upm.IWVG.SwC.Eneas;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;


public class PointTest extends TestCase {

	private Point pt;

    @Before
    public void setUp() {
        pt = new Point(2, 3);
    }

    @Test
    public void testPuntoIntInt() {
        assertEquals(2, pt.getX());
        assertEquals(3, pt.getY());
    }
    
    @Test
    public void testPuntoInt() {
        pt = new Point(2);
        assertEquals(2, pt.getX());
        assertEquals(2, pt.getY());
    }

    @Test
    public void testPunto() {
        pt = new Point();
        assertEquals(0, pt.getX());
        assertEquals(0, pt.getY());
    }

    @Test
    public void testModulo() {
        assertEquals(3.6055, pt.module(), 10e-5);
    }

    @Test
    public void testFase() {
        assertEquals(0.9828, pt.phase(), 10e-5);
    }

    @Test
    public void testChangePoint() {
        pt = new Point();
        pt.changePoint(2, 4);
        assertEquals(2,pt.getX());
        assertEquals(4,pt.getY());
        pt.changePoint(5, 6);
        assertEquals(5,pt.getX());
        assertEquals(6,pt.getY());
        
    }

    @Test
    public void testTranslate() {
        this.pt.translateOrigin(new Point(1, 1));
        assertEquals(1, pt.getX());
        assertEquals(2, pt.getY());
    }
}
