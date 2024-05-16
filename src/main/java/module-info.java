module org.example.pharmacymanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.supermarketmanagementsystem to javafx.fxml;
    exports org.example.supermarketmanagementsystem;
}