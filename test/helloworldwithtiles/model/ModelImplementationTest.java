/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiles.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Unai
 */
public class ModelImplementationTest {
    
    public ModelImplementationTest() {
    }

    /**
     * Test of getGreeting method, of class ModelImplementation.
     */
    @Test
    public void testGetGreeting() {
        String testGreeting = null;
        testGreeting = new ModelImplementation().getGreeting();
        assertNotNull("The greeting is null", testGreeting);
        assertTrue("The greeting isn't a String", testGreeting instanceof String);
        assertEquals("The greeting isn't equal", testGreeting, "Hello World");
    }
    
}
