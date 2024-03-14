package controller.admin;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class BookFormController {

    public JFXTextField txtSearch1;
    public TextField txtBookId1;
    public TextField txtRemove1;
    public TextField txtAuthor1;
    @FXML
    private TableColumn<?, ?> colAuthor;

    @FXML
    private TableColumn<?, ?> colBookId;

    @FXML
    private TableColumn<?, ?> colRemove;

    @FXML
    private TableColumn<?, ?> colStatus;

    @FXML
    private TextField txtAuthor;

    @FXML
    private TextField txtBookId;

    @FXML
    private TextField txtRemove;

    @FXML
    private JFXTextField txtSearch;

    @FXML
    private TextField txtStatus;

    @FXML
    void bookClikeOnAction(MouseEvent event) {

    }

    @FXML
    void btnAddBookOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

    public void btnAddUserOnAction(ActionEvent actionEvent) {
    }

    public void SearchOnAction(MouseEvent mouseEvent) {
    }
}
