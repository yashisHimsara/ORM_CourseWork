package controller.admin;

import bo.BOFactory;
import bo.BookBO;
import com.jfoenix.controls.JFXTextField;
import dto.AdminTm.BooksTm;
import dto.BookDto;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import bo.impl.BookBoimpl;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BookFormController {

    public JFXTextField txtSearch1;
    public TextField txtBookId1;
    public TextField txtRemove1;
    public TextField txtAuthor1;
    public TextField txtTitle;
    @FXML
    private ComboBox<?> cmbCatougery;

    @FXML
    private TableColumn<?, ?> colAuthor;

    @FXML
    private TableColumn<?, ?> colBookId;

    @FXML
    private TableColumn<?, ?> colCategory;

    @FXML
    private TableColumn<?, ?> colStatus;

    @FXML
    private TableColumn<?, ?> colTitle;
    @FXML
    private TableColumn<?, ?> colRemove;

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

    //BookBoimpl bookBoimpl = new BookBoimpl();
    private BookBO bookBO = (BookBO) BOFactory.getBoFactory().getBO(BOFactory.BOType.BOOK);
    private ObservableList<BooksTm> obList;

    private  void setCellValue(){
        colBookId.setCellValueFactory(new PropertyValueFactory<>("bookId"));
        colTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        colAuthor.setCellValueFactory(new PropertyValueFactory<>("author"));
        colCategory.setCellValueFactory(new PropertyValueFactory<>("category"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
        colRemove.setCellValueFactory(new PropertyValueFactory<>("remove"));
    }
    private void getAllBooks(){
        obList= FXCollections.observableArrayList();
        List<BookDto> allBooks = bookBO.getAllBooks();
        List<String> suggestionList = new ArrayList<>();

        for (BookDto dto: allBooks) {
            suggestionList.add(String.valueOf(dto.getId()));
        }
        Button buttonRemove=createRemoveButton();
        String status;
        if (BookDto.isstatus()){
            status="available";
        }else{
            status="notAvailable";
        }
        obList.add(new BooksTm()
    }
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

    }
}
