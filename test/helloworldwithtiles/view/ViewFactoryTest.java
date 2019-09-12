/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiles.view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2dam
 */
public class ViewFactoryTest {
    

    /**
     * Test of getView method, of class ViewFactory.
     */
    @Test
    public void testGetView() {
        ViewFactory testViewFactory = new ViewFactory();
        View testViewResult = null;
        testViewResult = testViewFactory.getView();
        assertNotNull("The method doesn't returns the model", testViewResult);
        assertTrue("The objects aren't equal", testViewResult instanceof View);
    }
    
}
