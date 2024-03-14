package controller.admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminDashBoardFormController {
    @FXML
    private AnchorPane AnchorPane1;

    @FXML
    private AnchorPane changeRoot;

    public void btnBookOnAction(ActionEvent actionEvent) throws IOException {
//        Parent parent= FXMLLoader.load(getClass().getResource("/view/admin/bookForm.fxml"));
//        changeRoot.getChildren().clear();
//        changeRoot.getChildren().add(parent);
        changeRoot.getChildren().clear();
        changeRoot.getChildren().add(FXMLLoader.load(getClass().getResource("/view/admin/bookForm.fxml")));

    }
    @FXML
    void btnBranchesOnAction(ActionEvent event) throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("/view/admin/BranchForm.fxml"));
        changeRoot.getChildren().clear();
        changeRoot.getChildren().add(parent);
    }

    @FXML
    void btnTransactionOnAction(ActionEvent event) throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("/view/admin/TransactionForm.fxml"));
        changeRoot.getChildren().clear();
        changeRoot.getChildren().add(parent);
    }

    @FXML
    void btnUserOnAction(ActionEvent event) throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("/view/admin/userForm.fxml"));
        changeRoot.getChildren().clear();
        changeRoot.getChildren().add(parent);
    }

}
