/*This class is been used to add item in the inventory. */



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddItemController {

    @FXML
    private TextField Iname;
    @FXML
    private TextArea description;
    @FXML
    private TextField id;
    @FXML
    private TextField price;
    @FXML
    private TextField quantity;
    @FXML
    private Label result;
    @FXML
    private Button Sub;

    @FXML
    void handleAddItem(ActionEvent event) {
        
        try {
           Item i1 = new Item(Iname.getText(),Double.parseDouble(price.getText()), Integer.parseInt(quantity.getText()),Integer.parseInt(id.getText()));
            if (!description.getText().equals("")) {
                i1.setDescription(description.getText());
            }
            Inventory.addItem(i1);
            result.setText("Item has been added to the Inventory");
        } catch (NumberFormatException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid");
            alert.setHeaderText("Please enter valid input");
            alert.showAndWait();
        }
        
        Stage stage = (Stage) Sub.getScene().getWindow();
        stage.close();
    }

}