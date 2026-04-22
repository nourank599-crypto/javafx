
import java.awt.Insets;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class NewFXMain extends Application {

        private Parent grid;
    
    @Override
    public void start(Stage primaryStage) {
        GridPane grid=new GridPane();
               grid.setHgap(10);
       grid.setVgap(10);
       grid.setAlignment(Pos.CENTER);
       //grid.setPadding(new Insets (30, 10, 10, 15));
           


      Label lblfirst=new Label("First Name: ");
      grid.add(lblfirst,0,0);

       TextField txtfirst=new TextField();
       grid.add(txtfirst, 1, 0);

       Label lblmi=new Label("MI: ");
       grid.add(lblmi, 0, 1);

        TextField txtmi=new TextField();
        grid.add(txtmi,1,1);

       Label lbllast=new Label("Last Name: ");
       grid.add(lbllast,0,2);

       TextField txtlast=new TextField();
      grid.add(txtlast, 1, 2);

       Button btn = new Button("Add Name");
       grid.add(btn,1,3);
        GridPane.setHalignment(btn, HPos.CENTER);
        Scene scene = new Scene(grid, 300, 250);
        
        primaryStage.setTitle("ShowGridPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
