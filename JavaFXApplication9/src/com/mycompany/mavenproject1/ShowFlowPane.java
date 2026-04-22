
package com.mycompany.mavenproject1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class ShowFlowPane extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        FlowPane root =new FlowPane();
        
       Label lblfirst=new Label("First Name: ");
       TextField txtfirst=new TextField();
       
       Label lblmi=new Label("MI");
        TextField txtmi=new TextField();
        
       Label lbllast=new Label("Last Name: ");
       TextField txtlast=new TextField();
      
       
       root.getChildren().addAll(lblfirst,txtfirst,lblmi,txtmi,lbllast,txtlast);
        

        Scene scene = new Scene(root, 350, 75);
        
        primaryStage.setTitle("ShoWfLOWPANE");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
