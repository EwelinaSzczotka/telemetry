package telemetry.view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import telemetry.ServerConnection;


public class LogsController implements Initializable {

    private ServerConnection connection;
    @FXML Button updButton;
    
    @FXML
    public void updateData(){
        connection.sendData();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    public void setConnection(ServerConnection connection){
        this.connection = connection;
    }
    
}
