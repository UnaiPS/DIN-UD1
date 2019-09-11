/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiles;

import helloworldwithtiles.controller.Controller;
import helloworldwithtiles.model.Model;
import helloworldwithtiles.model.ModelFactory;
import helloworldwithtiles.view.View;
import helloworldwithtiles.view.ViewFactory;

/**
 * This class is meant to be the main application
 * @author 2dam
 */
public class Application {
    public static void main (String[] args){
        ViewFactory viewFactory = new ViewFactory();
        View view = viewFactory.getView();
        
        ModelFactory modelFactory = new ModelFactory();
        Model model = modelFactory.getModel();
        
        Controller controller = new Controller();
        controller.run(view, model);
    }
}
