
/* This is main method used to launch the home page to start our explaimation */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
  public static void main(String[] args) throws Exception {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("LoginPortal.fxml"));
    Scene scene = new Scene(root);
    primaryStage.setTitle("Login Portal");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
