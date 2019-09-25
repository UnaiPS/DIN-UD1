/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiles.controller;

import helloworldwithtiles.model.Model;
import helloworldwithtiles.view.View;
import java.util.logging.Logger;

/**
 *  This class is meant to be the controller between the view and the model
 * @author Unai
 */
public class Controller {
    private static final Logger LOGGER = 
            Logger.getLogger("helloworldwithtiles.controller.Controller");
    /**
     * This mehtod executes the application's logic. Namelu, it orders the view
     * to show a greeting got from the model
     * @param view the view object
     * @param model the model object
     */
    public void run (View view, Model model){
        try {
            LOGGER.info("Starting run method.");
            String greeting = model.getGreeting();
            view.showGreeting(greeting);
            LOGGER.info("Ending run method.");
        } catch (Exception e) {
            LOGGER.severe(e.getMessage());
        }
        
    }
}
