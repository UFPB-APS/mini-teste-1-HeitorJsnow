

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SistemaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SistemaTest
{
    /**
     * Default constructor for test class SistemaTest
     */
    public SistemaTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void definirNomeSistema()
    {
        Sistema.setNome("Ebay");
        assertEquals("Ebay", Sistema.getNome());
    }
}
