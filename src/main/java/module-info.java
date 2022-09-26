module ch.francescoryu.soccersim {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens ch.francescoryu.soccersim to javafx.fxml;
    exports ch.francescoryu.soccersim;
}