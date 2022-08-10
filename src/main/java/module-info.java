module Test {
    requires javafx.fxml;
    requires javafx.controls;

    opens Main;
    opens View_Controller;
    opens Model;
}