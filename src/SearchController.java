import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class SearchController {

    @FXML
    private Label displaylbl;

    @FXML
    private TextField txtid;

    @FXML
    void SearchItems(MouseEvent event) {
        try {
            int id = Integer.parseInt(txtid.getText());
            if(Inventory.getItemById(id)==null)
                displaylbl.setText("No items has been found with the given id");
            else{
                displaylbl.setText("Item Name\t Itemid\t Price\t Quantity\t\n"
                    +Inventory.getItemById(id).toString());
            }
        } catch (Exception e) {
            System.out.println("Invalid input type");
        }
        
    }

}

