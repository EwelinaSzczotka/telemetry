package telemetry.view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import telemetry.ServerConnection;


public class ConfigurationController implements Initializable {

    private ServerConnection connection;
    @FXML
    public Button sendBtn;

    @FXML
    public void sendData(){
        connection.sendData();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println();
    }

    public void setConnection(ServerConnection connection){
        this.connection = connection;
    }
    
}
