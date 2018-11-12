import static org.junit.Assert.*;
import org.junit.*;
import junit.framework.*;

import org.junit.Test;

public class SecondClassTest extends TestCase{
    SecondClass c;

    public void setUp() {
        c = new SecondClass();
    }
    @Test
    public void testAdd() {
        assertEquals(c.add(2, 3), 5); // assertTrue ( c.add(2,3)==6);
    }

    public void testMul() {
        assertEquals(c.mul(2, 3), 6); // assertTrue ( c.mul(2,3)==6);
    }

    public void testDiv() {
        assertEquals(c.div(6, 3), 2); // assertTrue ( c.div(6,3)==2);
    }
}
