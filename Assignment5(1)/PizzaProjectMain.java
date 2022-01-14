import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;

//************************************************************************
//  PizzaProjectMain.java       Java Foundations
//
//  Pizza order with checkboxes and addition
//************************************************************************

public class PizzaProjectMain extends Application
{
    //--------------------------------------------------------------------
    //  Creates and presents the program window.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
        PizzaProjectPane gridPane = new PizzaProjectPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setStyle("-fx-background-color: white");
        
        Scene scene = new Scene(gridPane, 400, 150);
        
        primaryStage.setTitle("Pizza Project");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}
