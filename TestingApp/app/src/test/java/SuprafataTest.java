import com.example.user.lidiafirstapp.Suprafata;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SuprafataTest{

    Suprafata st;
    double tr, dr, rb, cr;

    @Before
    public void setUp() throws Exception {
        st = new Suprafata();
    }

    @After
    public void tearDown() throws Exception {
        System.out.print("Sum = " + tr + " Prod = " + dr +" Cat = " + rb);

    }

    @Test
    public void triungi() throws Exception {
        tr = st.triungi(5, 7);
        assertEquals(17, tr,0.1);
    }

    @Test
    public void dreptunghi() {
        dr = st.dreptunghi(10,5);
        assertEquals(50.01,dr,0.1);
    }

    @Test
    public void romb() {
        rb = st.romb(3,5);
        assertEquals(15,rb,0.1);
    }

    @Test
    public void cerc() {
        cr = st.cerc(3);
        assertEquals(19,cr,1);
    }
}