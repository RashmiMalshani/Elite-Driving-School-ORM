module lk.ijse.elite_driving_school_orm {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;
    requires org.apache.commons.logging;
    requires org.hibernate.orm.core;
    requires jakarta.persistence;
    requires static lombok;


    opens lk.ijse.elite_driving_school_orm to javafx.fxml;
    exports lk.ijse.elite_driving_school_orm;
}