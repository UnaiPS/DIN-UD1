/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiles.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 *
 * @author unain
 */
public class JavaFXViewImplementation extends javafx.application.Application implements View{
    
    private String greeting;
    
    @Override
    public void start(Stage stage) throws Exception {
        
        try{
            //Load node graph from fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("vista.fxml"));
            Parent root = (Parent)loader.load();
            //Get controller from graph
            FXMLDocumentController viewController = ((FXMLDocumentController)loader.getController());
            //Set greeting to be used in JavaFX view controller
            viewController.setGreeting(greeting);
            viewController.setStage(stage);
            viewController.initStage(root);
        }catch (Exception e){
            e.printStackTrace();
        }
        
//        Parent root = FXMLLoader.load(getClass().getResource("vista.fxml"));
//        
//        Scene scene = new Scene(root);
//        
//        stage.setScene(scene);
//        stage.show();
    }
    
    
    @Override
    public void showGreeting(String greeting) {
        launch(greeting);
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public void init() throws Exception {
        this.greeting = getParameters().getRaw().get(0);
    }
    
}
