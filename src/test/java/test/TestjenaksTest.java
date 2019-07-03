package test;

import junit.framework.TestCase;
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
       if(true){
           System.out.println("OK");

       }

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
