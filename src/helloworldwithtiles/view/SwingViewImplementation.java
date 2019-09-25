/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiles.view;

import javax.swing.*;
/**
 *
 * @author Unai
 */
public class SwingViewImplementation implements View{
    /**
     * This method shows the greeting on a JFrame window with a JOptionPane
     * @param greeting a String object
     */
    @Override
    public void showGreeting(String greeting) {
       JFrame window = new JFrame();
       
       JOptionPane.showMessageDialog(window, greeting, "Message", JOptionPane.INFORMATION_MESSAGE);
       
    }
    
    
}
