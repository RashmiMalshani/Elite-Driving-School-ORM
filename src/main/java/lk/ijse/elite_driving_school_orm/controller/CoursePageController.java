package lk.ijse.elite_driving_school_orm.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class CoursePageController {

    @FXML
    private TableColumn<?, ?> colAmount;

    @FXML
    private TableColumn<?, ?> colCourseId;

    @FXML
    private TableColumn<?, ?> colPaymentDate;

    @FXML
    private TableColumn<?, ?> colPaymentMethod;

    @FXML
    private TableColumn<?, ?> colStudentId;

    @FXML
    private TableView<?> tblCourse;

    @FXML
    private TextField txtAmount;

    @FXML
    private TextField txtCourseId;

    @FXML
    private TextField txtCourseId1;

    @FXML
    private TextField txtCourseId2;

    @FXML
    void handleClear(ActionEvent event) {

    }

    @FXML
    void handleDeleteCourse(ActionEvent event) {

    }

    @FXML
    void handleSaveCourse(ActionEvent event) {

    }

    @FXML
    void handleUpdateCourse(ActionEvent event) {

    }

    @FXML
    void tableClickOnAction(MouseEvent event) {

    }

}
