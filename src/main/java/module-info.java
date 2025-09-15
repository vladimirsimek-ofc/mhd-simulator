module com.vladimirsimek.mhd {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    exports com.vladimirsimek.mhd.logic.simulation;
    exports com.vladimirsimek.mhd.logic.locations;
    exports com.vladimirsimek.mhd.logic.vehicles;

    opens com.vladimirsimek.mhd to javafx.fxml;
    exports com.vladimirsimek.mhd;
}