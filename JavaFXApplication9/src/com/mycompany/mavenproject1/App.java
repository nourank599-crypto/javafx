
package com.mycompany.mavenproject1;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;



public class App extends Application {
    
     public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
      primaryStage.setTitle("Hello world!");
      
     
      
      //containers
       GridPane grid =new GridPane();
       grid.setHgap(10);
       grid.setVgap(10);
       grid.setAlignment(Pos.CENTER);
       grid.setPadding(new Insets(25));
       
       //controls
       Label lblTitle=new Label("Welcome");
       grid.add(lblTitle, 0, 0);
       lblTitle.setFont(Font.font("Tahoma",20));
       Label lblUser =new Label("Username");
      grid.add(lblUser, 0, 1);
     Label lblPass =new Label("Passward");
       grid.add(lblPass, 0,2 ); 
       Label lblAction = new Label();
       grid.add(lblAction,1,5);
       
       
       TextField txtUser=new TextField();
       grid.add(txtUser, 1, 1);
        PasswordField txtPass =new PasswordField();
       grid.add(txtPass, 1, 2);
       
       
      Button btnLogin =new Button("Sign in");
      grid.add(btnLogin,1,4);
      btnLogin.setOnAction(e -> {
      lblAction.setText("Button Pressed");
       btnLogin.setText("Button Pressed");
      //System.out.println("Button Pressed");
      
      });
      
      
       Scene scene =new Scene(grid, 300,275);
       primaryStage.setScene(scene);
      primaryStage.show();
        }
}




