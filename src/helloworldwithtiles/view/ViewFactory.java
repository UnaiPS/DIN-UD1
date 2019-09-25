/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiles.view;

/**
 *
 * @author Unai
 */
public class ViewFactory {
    /**
     * This method is going to get the view from JavaFXViewImplementation class
     * @return a View object
     */
    public static View getView(){
        return new JavaFXViewImplementation();
    }
}
