module org.example.pharmacymanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.supermarketmanagementsystem to javafx.fxml;
    exports org.example.supermarketmanagementsystem;
}