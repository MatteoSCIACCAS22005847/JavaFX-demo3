module com.example.javafxdemo3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.javafxdemo3 to javafx.fxml;
    exports com.example.javafxdemo3;
}