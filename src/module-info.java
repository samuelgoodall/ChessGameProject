
module ChessGameJavaFx {

    requires javafx.controls;
    requires javafx.fxml;
    requires org.junit.jupiter.api;

    opens org.openjfx to javafx.fxml;


    exports org.openjfx;
}