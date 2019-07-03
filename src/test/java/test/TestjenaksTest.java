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
public class TestjenaksTest {


    @Test
    public void testMethodOne() {
        Assert.assertTrue(true);
    }

    @Test
    public void testMethodTwo() {
        Assert.assertTrue(false);
    }


    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }


} 
