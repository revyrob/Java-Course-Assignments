import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.layout.GridPane;
import java.awt.Insets;
import javafx.scene.Scene;
import javafx.geometry.HPos;
import java.text.DecimalFormat;


//************************************************************************
//  PizzaProjectPane.java       Java Foundations
//
//  Pizza project pane with checkboxes and addition
//************************************************************************

public class PizzaProjectPane extends GridPane
{
    private Text costText;
    private double cost;
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private CheckBox extraCheeseCheckBox, pepperoniCheckBox, greenPepperCheckBox,
    sausageCheckBox, onionsCheckBox, anchoviesCheckBox;
    
    //--------------------------------------------------------------------
    //  Sets up this pane with a Text object and check boxes that
    //  determine the what is in the pizza and cost.
    //--------------------------------------------------------------------
    public PizzaProjectPane()
    {
        //creating checkboxes for pizaa ingredients
        extraCheeseCheckBox = new CheckBox("Extra Cheese");
        extraCheeseCheckBox.setOnAction(this::processCheckBoxAction);
        
        pepperoniCheckBox = new CheckBox("Pepperoni");
        pepperoniCheckBox.setOnAction(this::processCheckBoxAction);
        
        greenPepperCheckBox = new CheckBox("Green Pepper");
        greenPepperCheckBox.setOnAction(this::processCheckBoxAction);
        
        sausageCheckBox = new CheckBox("Sausage");
        sausageCheckBox.setOnAction(this::processCheckBoxAction);
        
        onionsCheckBox = new CheckBox("Onions");
        onionsCheckBox.setOnAction(this::processCheckBoxAction);
        
        anchoviesCheckBox = new CheckBox("Anchovies");
        anchoviesCheckBox.setOnAction(this::processCheckBoxAction);
        
        //setting vertical and horizontal gaps btw the columns
        setAlignment(Pos.CENTER);
        setHgap(10);
        setVgap(10);
        
        //adding phrase with pizza cost
        cost = 10.00;
        costText = new Text("Pizza Cost: $" + df.format(cost));
        costText.setFont(new Font("Arial", 20));
    
        //arranging all checkboxes in the grid
        add(extraCheeseCheckBox, 0, 0);
        add(pepperoniCheckBox, 0, 1);
        add(sausageCheckBox, 0, 2);
        add(greenPepperCheckBox, 1, 0);
        add(onionsCheckBox, 1, 1);
        add(anchoviesCheckBox, 1, 2);
        add(costText, 0, 3);
        
    }
    
    //--------------------------------------------------------------------
    //  Updates the font style of the displayed text.
    //--------------------------------------------------------------------
    public void processCheckBoxAction(ActionEvent event)
    {
        double cost = 10.00;
        
        //creating the actions for each checkbox selected
        if (extraCheeseCheckBox.isSelected()) {
            cost += 0.50; 
        } 
        if (pepperoniCheckBox.isSelected()) {
            cost += 0.50;
        } 
        if (sausageCheckBox.isSelected()) {
            cost += 0.50;
        } 
        if (greenPepperCheckBox.isSelected()) {
            cost += 0.50;
        } 
        if (onionsCheckBox.isSelected()) {
            cost += 0.50;
        }  
        if (anchoviesCheckBox.isSelected()){
            cost += 0.50;
        } 
        
        //converts the cost to a 2 decimal digit
        //displays new pizza cost price
        costText.setText("Pizza Cost: $" + df.format(cost));

    }
}