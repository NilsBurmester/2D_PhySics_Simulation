module com.example._2d_physics_simulation {
    requires javafx.controls;
    requires javafx.fxml;
                requires kotlin.stdlib;
    
                            
    opens com.example._2d_physics_simulation to javafx.fxml;
    exports com.example._2d_physics_simulation;
}