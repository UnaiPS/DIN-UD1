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
public class ViewImplementation implements View{
    /**
     * This method shows the greeting
     * @param greeting a String object
     */
    public void showGreeting(String greeting){
        System.out.println(greeting);
    }
}
