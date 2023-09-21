package lk.ijse.dep11;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainSceneController {
    public Button btnNextPage;
    public AnchorPane MainSceneRoot;

    public void btnNextPageOnAction(ActionEvent actionEvent) throws IOException {
        Scene scene1 = new Scene(FXMLLoader.load(getClass().getResource("/view/Scene1.fxml")));
        //Stage primaryStage = new Stage();
        Stage primaryStage = (Stage) MainSceneRoot.getScene().getWindow();
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Scene 01");
        primaryStage.show();
        primaryStage.sizeToScene();
        primaryStage.centerOnScreen();




    }

}
