package lk.ijse.dep11;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene1Controller {

    public ComboBox<String> cmbGrade;

    public void cmbGradeOnAction(ActionEvent actionEvent) {
    }

    public void initialize() {
        cmbGrade.getItems().addAll("Grade 6", "Grade 7", "Grade 8", "Grade 9", "Grade 10", "Grade 11");

        cmbGrade.setOnAction(e -> {
            String selectedItem = cmbGrade.getSelectionModel().getSelectedItem();
            if (selectedItem != null) {
                loadGradeScene(selectedItem);
            }
        });
    }

    private void loadGradeScene(String grade) {
        String gradeFXMLPath = "/view/" + grade.toLowerCase().replace(" ", "") + "Scene.fxml";

        try {
            Scene gradeScene = new Scene(FXMLLoader.load(getClass().getResource(gradeFXMLPath)));
            Stage primaryStage = new Stage();
            primaryStage.setScene(gradeScene);
            primaryStage.show();
            primaryStage.setTitle(grade);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }


}
