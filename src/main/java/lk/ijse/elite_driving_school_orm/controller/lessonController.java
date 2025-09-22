package lk.ijse.elite_driving_school_orm.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class lessonController {

    @FXML
    private TableColumn<?, ?> colDate;

    @FXML
    private TableColumn<?, ?> colDuration;

    @FXML
    private TableColumn<?, ?> colInstructor;

    @FXML
    private TableColumn<?, ?> colLessonFee;

    @FXML
    private TableColumn<?, ?> colLessonId;

    @FXML
    private TableColumn<?, ?> colLessonName;

    @FXML
    private TableColumn<?, ?> colTime;

    @FXML
    private DatePicker dpLessonDate;

    @FXML
    private TableView<?> tblLesson;

    @FXML
    private TextField txtDuration;

    @FXML
    private TextField txtInstructor;

    @FXML
    private TextField txtLessonFee;

    @FXML
    private TextField txtLessonId;

    @FXML
    private TextField txtLessonName;

    @FXML
    private TextField txtTime;

    @FXML
    void handleClear(ActionEvent event) {

    }

    @FXML
    void handleDeleteLesson(ActionEvent event) {

    }

    @FXML
    void handleSaveLesson(ActionEvent event) {

    }

    @FXML
    void handleUpdateLesson(ActionEvent event) {

    }

    @FXML
    void tableClickOnAction(MouseEvent event) {

    }

}
