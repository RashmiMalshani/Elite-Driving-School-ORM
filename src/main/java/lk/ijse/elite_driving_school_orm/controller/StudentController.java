package lk.ijse.elite_driving_school_orm.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import lk.ijse.elite_driving_school_orm.bo.BOFactory;
import lk.ijse.elite_driving_school_orm.bo.custom.StudentBO;
import lk.ijse.elite_driving_school_orm.dto.StudentDTO;

import java.util.Optional;

public class StudentController {

    StudentBO studentBO = (StudentBO) BOFactory.getBOFactory().getBO(BOFactory.BOTypes.STUDENT);

    @FXML
    private Button btnClear;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnSave;

    @FXML
    private Button btnUpdate;

    @FXML
    private TableColumn<?, ?> colAddress;

    @FXML
    private TableColumn<?, ?> colEmail;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colPhone;

    @FXML
    private TableColumn<?, ?> colRegDate;

    @FXML
    private TableColumn<?, ?> colRegisterFee;

    @FXML
    private TableColumn<?, ?> colStudentId;

    @FXML
    private DatePicker dpRegistrationDate;

    @FXML
    private TableView<StudentDTO> tblStudent;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPhone;

    @FXML
    private TextField txtRegisterFee;

    @FXML
    private TextField txtStudentId;

    public void initialize() {
        loadTable();
        setCellValueFactory();
    }

    private void setCellValueFactory() {
        colStudentId.setCellValueFactory(new PropertyValueFactory<>("studentId"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colPhone.setCellValueFactory(new PropertyValueFactory<>("phone"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colRegDate.setCellValueFactory(new PropertyValueFactory<>("registrationDate"));
        colRegisterFee.setCellValueFactory(new PropertyValueFactory<>("registerFee"));
    }

    private void loadTable() {
//        ArrayList<StudentDTO> studentDTOs = studentBO.getAllStudents();
//        ObservableList<StudentDTO> data = FXCollections.observableArrayList(studentDTOs);
//
//        for (StudentDTO studentDTO : data) {
//            data.add(studentDTO);
//        }
//        tblStudent.setItems(data);
    }

    @FXML
    void handleClearStudent(ActionEvent event) {
txtStudentId.clear();
txtName.clear();
txtAddress.clear();
txtPhone.clear();
txtEmail.clear();
dpRegistrationDate.setValue(null);
txtRegisterFee.clear();
    }

    @FXML
    void handleDeleteStudent(ActionEvent event) {
        Long id = Long.valueOf(txtStudentId.getText());

        if (id == null) {
            new Alert(Alert.AlertType.WARNING, "Please select a class to delete.", ButtonType.OK).show();
            return;
        }

        Alert confirmAlert = new Alert(Alert.AlertType.CONFIRMATION);
        confirmAlert.setTitle("Delete Confirmation");
        confirmAlert.setHeaderText(null);
        confirmAlert.setContentText("Are you sure you want to delete the class with ID: " + id + "?");

        Optional<ButtonType> result = confirmAlert.showAndWait();

        if (result.isPresent() && result.get() == ButtonType.OK) {
//            boolean isDelete = studentBO.delete(id);
//            if (isDelete) {
//                loadTable();
//                new Alert(Alert.AlertType.INFORMATION, "Deleted Successfully").show();
//            } else {
//                new Alert(Alert.AlertType.ERROR, "Deleting Failed").show();
//            }
        } else {
            new Alert(Alert.AlertType.INFORMATION, "Deletion Cancelled").show();
        }
    }

    @FXML
    void handleSaveStudent(ActionEvent event) {
    }

    @FXML
    void handleUpdateStudent(ActionEvent event) {

    }

    @FXML
    void tableClickOnAction(MouseEvent event) {

    }

}
