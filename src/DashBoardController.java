import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class DashBoardController {
    @FXML
    private Button Sub;

    @FXML
    private Button addUser;

    @FXML
    void HandleAddUser(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("AddUser.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Add User");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            System.out.println("Cannot load the new Window");
        }
        
    }
    @FXML
    void HandleItem(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("AddItem.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Add Items");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            System.out.println("Cannot load the new Window");
        }
    }

    @FXML
    void HandleReports(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Reports.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Generate reports");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            System.out.println("Cannot load the new Window");
        }
        
    }
    @FXML
    void HandleSearch(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("SearchItems.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Search Items");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            System.out.println("Cannot load the new Window");
        }
    }
    @FXML
    void HandleInventory(ActionEvent event) throws FileNotFoundException {
        File myFile = new File("order.txt");
        Scanner input = new Scanner(myFile);
        try {
            input.useDelimiter(",");
            while (input.hasNextLine()) {
                String itemName = input.next();
                double itemPrice = input.nextDouble();
                int quantity = input.nextInt();
                int id = input.nextInt();

                Item i1 = new Item(itemName, itemPrice,quantity, id);
                Inventory.inventory.add(i1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            input.close();
        }
    }

}