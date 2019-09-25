/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiles.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Unai
 */
public class ModelFactoryTest {
    /**
     * Test of getModel method, of class ModelFactory.
     */
    @Test
    public void testGetModel() {
       ModelFactory testModelFactory = new ModelFactory();
       Model testModelResult = null;
       testModelResult = testModelFactory.getModel();
       assertNotNull("The method doesn't returns the model", testModelResult);
       assertTrue("The objects aren't equal", testModelResult instanceof Model);
    }
    
}
