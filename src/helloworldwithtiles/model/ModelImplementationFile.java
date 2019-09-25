/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiles.model;

import java.util.ResourceBundle;

/**
 *
 * @author Unai
 */
public class ModelImplementationFile implements Model{
    
    /**
     * This method takes from the Model interface and get's a greeting
     * @return return's a String with a greeting
     */
    @Override
    public String getGreeting(){
        return ResourceBundle.getBundle("helloworldwithtiles.model.greeting").getString("greeting");
    }
}
