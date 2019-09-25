/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiles.view;

import javafx.stage.Stage;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.testfx.api.FxAssert.verifyThat;
import org.testfx.framework.junit.ApplicationTest;
import static org.testfx.matcher.control.LabeledMatchers.hasText;

/**
 *
 * @author Unai
 */
public class FXMLDocumentControllerIT extends ApplicationTest {
    private final String GREETING = "Hello World";
    
    /**
     * This method starts the test class
     * @param stage a Stage object
     * @throws Exception can throw a exception
     */
    @Override
    public void start (Stage stage) throws Exception {
        JavaFXViewImplementation myapp = new JavaFXViewImplementation();
        myapp.setGreeting(GREETING);
        myapp.start(stage);
        
    }
    
    
    public FXMLDocumentControllerIT() {}
    /**
     * This method tests the button of the application
     */
    @Test
    public void testButtonClick () {
        verifyThat("#textLabel", hasText(GREETING));
        //clickOn("#button");
        //JavaFX Test no puede comprobar que se cierra la aplicacion.
    }
    
}
