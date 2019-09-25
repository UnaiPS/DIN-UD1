/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiles.view;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author Unai
 */
public class FXMLDocumentController {
    @FXML
    private Label textLabel;
    private String greeting;
    private Stage stage;
    
    /**
     * This method set the greeting to be displayed
     * @param greeting is a String with a greeting, this is meant to be getGreeting from model package
     */
    public void setGreeting(String greeting){
        this.greeting=greeting;
    }
    /**
     * This method initializes the stage
     * @param root 
     */
    public void initStage(Parent root){
        //Create scene an set document for it
        Scene scene = new Scene(root);
        //Set scene in stage and show it
        stage.setScene(scene);
        stage.setOnShowing(this::onWindowShowing);
        stage.show();
    }
    /**
     * When the button is pressed, the window closes and the program stops
     * @param event This is going to be the event when the button is pressed
     */
    @FXML
    private void handleButtonAction(ActionEvent event){
        Platform.exit();
    }
    /**
     * With this method, is going to change the value of the label to show the greeting when the window starts showing
     * @param e the event of the window
     */
    private void onWindowShowing(WindowEvent e){
        textLabel.setText(greeting);
    }
    /**
     * This method sets a stage
     * @param stage a Stage object
     */
    void setStage(Stage stage) {
        this.stage = stage;
    }
    
    
}
