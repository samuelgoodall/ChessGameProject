
module ChessGameJavaFx {

    requires javafx.controls;
    requires javafx.fxml;
    requires junit;
    requires org.junit.jupiter.api;


    opens org.openjfx to javafx.fxml;


    exports org.openjfx;
    exports GamePieces;
}