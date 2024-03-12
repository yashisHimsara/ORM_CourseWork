import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class launcher extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent parent= FXMLLoader.load(this.getClass().getResource("/view/mainLoginForm.fxml"));
        Scene scene=new Scene(parent);
        stage.setScene(scene);
        stage.setTitle(" ");
        stage.centerOnScreen();
        stage.show();
    }
}
