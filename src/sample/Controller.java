package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Controller {

    private BlindsProxy blinds;

    public Controller() {
        blinds = new BlindsProxy();
    }

    @FXML
    private void buttonUpAction(ActionEvent event) {
        blinds.up();
    }

    @FXML
    private void buttonStopAction(ActionEvent event) {
        blinds.stop();
    }

    @FXML
    private void buttonDownAction(ActionEvent event) {
        blinds.down();
    }
}
