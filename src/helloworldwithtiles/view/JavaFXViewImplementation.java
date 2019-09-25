/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiles.view;

import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 *
 * @author Unai
 */
public class JavaFXViewImplementation extends javafx.application.Application implements View{
    private static final Logger LOGGER = Logger.getLogger("helloworldwithtiles.view.JavaFXViewImplementation");
    private String greeting;
    /**
     * This method starts the JavaFX application
     * @param stage the stage object
     * @throws Exception this method can throw a exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        
        try{
            LOGGER.info("Starting JavaFX application.");
            //Load node graph from fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("vista.fxml"));
            Parent root = (Parent)loader.load();
            //Get controller from graph
            FXMLDocumentController viewController = ((FXMLDocumentController)loader.getController());
            //Set greeting to be used in JavaFX view controller
            viewController.setGreeting(greeting);
            viewController.setStage(stage);
            viewController.initStage(root);
            LOGGER.info("Finished JavaFX application start.");
        }catch (Exception e){
            LOGGER.severe(e.getMessage());
            //e.printStackTrace();
        }
        
//        Parent root = FXMLLoader.load(getClass().getResource("vista.fxml"));
//        
//        Scene scene = new Scene(root);
//        
//        stage.setScene(scene);
//        stage.show();
    }
    
    /**
     * This method shows the greeting on the scene
     * @param greeting the string object
     */
    @Override
    public void showGreeting(String greeting) {
        LOGGER.info("Starting launch method.");
        launch(greeting);
        LOGGER.info("Ending launch method.");
    }
    /**
     * This method sets the greeting
     * @param greeting a String object
     */
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
    /**
     * This method initializes the JavaFX application
     * @throws Exception a exception can be thrown
     */
    @Override
    public void init() throws Exception {
        this.greeting = getParameters().getRaw().get(0);
    }
    
}
