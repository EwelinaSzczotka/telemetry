package telemetry;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import telemetry.view.RootLayoutController;



public class MainApp extends Application{
    
    private Stage primaryStage;
    private AnchorPane rootLayout;
    private ServerConnection connection;
    
    
    public MainApp(){
        connection = new ServerConnection();
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Telemetry");

        initRootLayout();  
    }
    
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/telemetry/view/RootLayout.fxml"));
            rootLayout = loader.load();
            RootLayoutController controller = loader.getController();
            controller.setConnection(connection);

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
