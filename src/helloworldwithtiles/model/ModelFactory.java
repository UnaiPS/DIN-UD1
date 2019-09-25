/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiles.model;

/**
 *
 * @author Unai
 */
public class ModelFactory {
    /**
     * This method gets the model from the implementation
     * @return a Model object
     */
    public static Model getModel(){
        return new ModelImplementationFile();
    }
}
