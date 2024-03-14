package controller.admin;

import com.jfoenix.controls.JFXTextField;
import dto.BookDto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import bo.impl.BookBoimpl;

public class BookFormController {

    public JFXTextField txtSearch1;
    public TextField txtBookId1;
    public TextField txtRemove1;
    public TextField txtAuthor1;
    public TextField txtTitle;
    @FXML
    private ComboBox<?> cmbCatougery;
    public TableColumn colRemove1;
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

    BookBoimpl bookBoimpl = new BookBoimpl();

    @FXML
    void bookClikeOnAction(MouseEvent event) {

    }
    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

    public void btnAddUserOnAction(ActionEvent actionEvent) {
    }

    public void SearchOnAction(MouseEvent mouseEvent) {
    }

    public void btnAddOnAction(ActionEvent actionEvent) {
        String id = txtBookId.getText();
        String title = txtTitle.getText();
        String autor = txtAuthor.getText();
        String cat = (String) cmbCatougery.getValue();
        String status = txtStatus.getText();

        var book = new BookDto(id,title,autor,cat,status);

        boolean isSave = bookBoimpl.saveBook(book);
    }
}
