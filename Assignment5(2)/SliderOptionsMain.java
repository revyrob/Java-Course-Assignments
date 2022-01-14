import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;

//************************************************************************
//  TextControl.java       Java Foundations
//
//  Slider for text size
//************************************************************************

public class SliderOptionsMain extends Application
{
    //--------------------------------------------------------------------
    //  Creates and presents the program window.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
        SliderOptionPane pane = new SliderOptionPane();
        pane.setAlignment(Pos.CENTER);
        pane.setStyle("-fx-background-color: cadetblue");

        Scene scene = new Scene(pane, 400, 150);
        
        primaryStage.setTitle("Text Size Slider");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}
