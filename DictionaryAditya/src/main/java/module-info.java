module com.example.dictionaryaditya {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dictionaryaditya to javafx.fxml;
    exports com.example.dictionaryaditya;
}