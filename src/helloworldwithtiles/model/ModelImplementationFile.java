/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiles.model;

import java.util.ResourceBundle;

/**
 *
 * @author 2dam
 */
public class ModelImplementationFile implements Model{
    
    @Override
    public String getGreeting(){
        return ResourceBundle.getBundle("helloworldwithtiles.model.greeting").getString("greeting");
    }
}
