package test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * Testjenaks Tester.
 *
 * @author <Authors name>
 * @version 1.0
 */
public class TestjenaksTest extends TestCase {


    @Test
    public void testMethodOne() {
        Assert.assertTrue(true);
        System.out.println("OK");

    }

//    @Test
//    public void testMethodTwo() {
//        Assert.assertTrue(false);
//        System.out.println("OK");
//    }


    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }


} 
