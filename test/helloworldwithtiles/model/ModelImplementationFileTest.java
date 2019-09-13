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
 * @author 2dam
 */
public class ModelImplementationFileTest {
    
    public ModelImplementationFileTest() {
    }

    /**
     * Test of getGreeting method, of class ModelImplementationFile.
     */
    @Test
    public void testGetGreeting() {
        String testFile = null;
        testFile = new ModelImplementationFile().getGreeting();
        assertNotNull("The greeting is null", testFile);
        assertTrue("The greeting isn't a string", testFile instanceof String);
        assertEquals("The greetins aren't equal", testFile, "Hello World");
    }
    
}
