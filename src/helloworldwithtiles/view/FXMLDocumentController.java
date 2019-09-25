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
 * @author unain
 */
public class FXMLDocumentController {
    @FXML
    private Label textLabel;
    private String greeting;
    private Stage stage;
    
    public void setGreeting(String greeting){
        this.greeting=greeting;
    }
    
    public void initStage(Parent root){
        //Create scene an set document for it
        Scene scene = new Scene(root);
        //Set scene in stage and show it
        stage.setScene(scene);
        stage.setOnShowing(this::onWindowShowing);
        stage.show();
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event){
        Platform.exit();
    }
    
    private void onWindowShowing(WindowEvent e){
        textLabel.setText(greeting);
    }

    void setStage(Stage stage) {
        this.stage = stage;
    }
    
    
}
