import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class LoginController implements Initializable {

    User u1 = new User("abc","abc",true);
    Stage stage = new Stage();

    @FXML
    private PasswordField Pass;

    @FXML
    private TextField uName;

    @FXML
    void handleCancel(ActionEvent event) {
        System.out.println("Bye. Click on run to relaunch it!");
        System.exit(1);
    }

    @FXML
    void handleLogin(ActionEvent event) throws IOException {
        if(isValidLogin(uName.getText(), Pass.getText())){
            Parent root1 = FXMLLoader.load(getClass().getResource("DashBoard.fxml"));
            Stage stage1 = new Stage();
            stage1.setTitle("DashBoard");
            stage1.setScene(new Scene(root1));
            stage1.show();
        }
        else
            alertHandling();
        
        }
        


    @Override
    public void initialize(URL location, ResourceBundle resources) {
       
    }
    private void alertHandling() {
        Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Login Failed");
                alert.setHeaderText("Invalid username or password");
                alert.setContentText("Please try again.");
                alert.showAndWait();
        
    }
    private boolean isValidLogin(String username, String password) {
        u1.add(u1);
        for (User user : User.userList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
    
