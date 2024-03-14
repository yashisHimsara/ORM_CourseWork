package controller.user;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class UserDashBoardFormController {
    @FXML
    private AnchorPane AnchorPane2;
    public void btnBookOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("/view/user/bookForm.fxml"));
        AnchorPane2.getChildren().clear();
        AnchorPane2.getChildren().add(parent);
    }
    public void btnTransactionOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("/view/user/TransactionForm.fxml"));
        AnchorPane2.getChildren().clear();
        AnchorPane2.getChildren().add(parent);
    }

    public void btnBorrowOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("/view/user/BorrowBookForm.fxml"));
        AnchorPane2.getChildren().clear();
        AnchorPane2.getChildren().add(parent);
    }
}
