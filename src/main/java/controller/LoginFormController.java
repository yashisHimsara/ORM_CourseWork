package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class LoginFormController {
    @FXML
    private AnchorPane SubAnchorPane;

    public void initialize() throws IOException {
        userPage();
    }
    @FXML
    void AdminClickOnAction(MouseEvent event) throws IOException {
        Parent node = FXMLLoader.load(this.getClass().getResource("/view/admin.fxml"));
        this.SubAnchorPane.getChildren().clear();
        this.SubAnchorPane.getChildren().add(node);
    }
    @FXML
    void UserClickOnAction(MouseEvent event) throws IOException {
        userPage();
    }

    private void userPage() throws IOException {
        Parent node = FXMLLoader.load(this.getClass().getResource("/view/user.fxml"));
        this.SubAnchorPane.getChildren().clear();
        this.SubAnchorPane.getChildren().add(node);
    }
}
