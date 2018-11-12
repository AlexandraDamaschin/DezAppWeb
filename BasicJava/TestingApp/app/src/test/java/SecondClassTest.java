import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SecondClassTest {

    SecondClass c;

    int a,b,d;
    @Before
    public void setUp() throws Exception {
        c= new SecondClass();
    }
    @After
    public void tearDown() throws Exception {
        System.out.print("Sum = " + a + " Prod = " + b +" Cat = " + d);
    }
    @Test
    public void add() throws Exception {
        a=c.add(2,2);
        assertEquals(5,a);
    }
    @Test
    public void mul() throws Exception {
        b=c.mul(2,2);
        assertEquals(4, b);
    }
    @Test
    public void div() throws Exception {
        d=c.div(4,2);
        assertEquals(2,d);
    }
}