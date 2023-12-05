package weekNine;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class testStaticTest {
    private testStatic testOne;
    private testStatic testTwo;

    @BeforeEach
    public void setUp(){
        testOne = new testStatic();
        testTwo = new testStatic(5,"testing",true);
    }

    @Test
    public void testInstantCount(){
        testOne = new testStatic();
        testTwo = new testStatic(5,"testing",true);
        assertEquals(2, testStatic.getInstanceCount());
    }

}