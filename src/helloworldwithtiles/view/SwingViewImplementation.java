/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiles.view;

import javax.swing.*;
/**
 *
 * @author 2dam
 */
public class SwingViewImplementation implements View{

    @Override
    public void showGreeting(String greeting) {
       JFrame window = new JFrame();
       
       JOptionPane.showMessageDialog(window, greeting, "Message", JOptionPane.INFORMATION_MESSAGE);
       
    }
    
    
}
