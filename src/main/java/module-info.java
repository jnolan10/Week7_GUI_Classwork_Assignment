module com.mycompany.week7_classwork_gui_assignment {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.week7_classwork_gui_assignment to javafx.fxml;
    exports com.mycompany.week7_classwork_gui_assignment;
}
