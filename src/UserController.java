import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class UserController {
    @FXML
    private Button Sub;
    
    @FXML
    private RadioButton admin;

    @FXML
    private RadioButton employee;

    @FXML
    private TextField passTF;

    @FXML
    private ToggleGroup permission;

    @FXML
    private TextField userTF;

    @FXML
    void HandleConfirm(ActionEvent event) {
        String user = userTF.getText();
        String pass = passTF.getText();
        boolean permission = admin.isSelected()?true:false;

        User u1 = new User(user,pass,permission);
        u1.add(u1);
        System.out.println(User.userList);
        Stage stage = (Stage) Sub.getScene().getWindow();
        stage.close();
    }


}
