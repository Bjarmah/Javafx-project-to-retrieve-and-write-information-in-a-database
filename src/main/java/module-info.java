module com.class_project_.class_project_ {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.class_project_9.class_project_9 to javafx.fxml;
    exports com.class_project_9.class_project_9;
}