package controller.admin;


import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class BranchFormController {
    @FXML
    private TableColumn<?, ?> colBranchId;

    @FXML
    private TableColumn<?, ?> colLocation;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colRemove;

    @FXML
    private TextField txtBranchId;

    @FXML
    private TextField txtLocation;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtRemove;

    @FXML
    private JFXTextField txtSearch;

    public void branchClikeOnAction(MouseEvent mouseEvent) {
        
    }

    public void btnBranchOnAction(ActionEvent actionEvent) {
    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
    }

    public void SearchClikeOnAction(MouseEvent mouseEvent) {
    }

    public void TransactionClikeOnAction(MouseEvent mouseEvent) {
    }
}
