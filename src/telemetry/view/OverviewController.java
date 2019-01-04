package telemetry.view;

import java.net.InetAddress;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import telemetry.ServerConnection;


public class OverviewController implements Initializable {

    private ServerConnection connection;
    
    @FXML private Button connectBtn;
    @FXML private Button disconnectBtn;
    @FXML private Label connectLbl;
    
    @FXML
    private void connect() throws Exception{
        connection.connectToServer();
        connectBtn.setDisable(true);
        disconnectBtn.setDisable(false);
        connectLbl.setText("Connected to server.");
    }
    
    @FXML
    private void disconnect(){
        connection.disconnect();
        connectBtn.setDisable(false);
        disconnectBtn.setDisable(true);
        connectLbl.setText("Disconnected.");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) { }    
    
    public void setConnection(ServerConnection connection){
        this.connection = connection;
    }
    
}
