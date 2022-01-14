import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.control.Slider;
import java.awt.Insets;
import javax.swing.event.ChangeListener;
import javax.swing.JSlider;
import javafx.beans.value.ObservableValue;

//************************************************************************
//  SliderOptionPane.java       Java Foundations
//
//  Demonstrates the use of check boxes.
//************************************************************************

public class SliderOptionPane extends VBox
{
    private Text phrase;
    private Slider xSlider;

    //--------------------------------------------------------------------
    //  Sets up this pane with a Text object and check boxes that
    //  determine the style of the text font.
    //--------------------------------------------------------------------
    public SliderOptionPane()
    {
        phrase = new Text("Change my size!");
        phrase.setFont(new Font("Helvetica", 25));
        
        xSlider = new Slider (0, 50, 25);
        xSlider.setShowTickMarks(true);
        xSlider.setShowTickLabels(true);
        xSlider.setMajorTickUnit(50);
        xSlider.setBlockIncrement(10);
        
        xSlider.valueProperty().addListener(
        (observableValue, oldValue, newValue) ->
                phrase.setFont(new Font(newValue.doubleValue()))
        );

        HBox options = new HBox(xSlider);
        options.setAlignment(Pos.CENTER);
        options.setSpacing(20);  
        
        setSpacing(20);  
        getChildren().addAll(phrase, options);
    }
}
