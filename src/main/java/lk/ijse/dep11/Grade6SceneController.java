package lk.ijse.dep11;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class Grade6SceneController {
    public AnchorPane grade6root;
    public TextField txtNumber;
    public TextField txtName;
    public Button btnSave;
    public Button btnRemove;
    public Button btnNumber;
    public TableView<Students> tblStudents;


    public void initialize(){

        tblStudents.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("Number"));
        tblStudents.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("Name"));
        tblStudents.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("contactNumber"));

        btnRemove.setDisable(true);

        tblStudents.getSelectionModel().selectedItemProperty().addListener((value, previous, current)-> {

        });
        }

    public void btnSaveOnAction(ActionEvent actionEvent) {
    }

    public void btnRemoveOnAction(ActionEvent actionEvent) {
    }

    public void btnNumberOnAction(ActionEvent actionEvent) {
    }
}
