package telemetry.view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import telemetry.MainApp;
import telemetry.ServerConnection;


public class RootLayoutController implements Initializable {

    @FXML private OverviewController overviewTabController;
    @FXML private LogsController logsTabController;
    @FXML private ConfigurationController configurationTabController;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    public void setConnection(ServerConnection connection){
        overviewTabController.setConnection(connection);
        configurationTabController.setConnection(connection);
        logsTabController.setConnection(connection);

    }
    
    
    
}
