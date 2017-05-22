package sample;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

/**
 * Created by jonasschmides on 22.05.17.
 * Übung5 - ProxyPattern
 */
class BlindsProxy implements Blinds {

    private String stage = "home/wohnzimmer/rollo";

    @Override
    public void up() {
        sendMessage(">0");
    }

    @Override
    public void down() {
        sendMessage("-0");
    }

    @Override
    public void goToPosition(int position) {
        sendMessage(Integer.toString(position));
    }

    @Override
    public void stop() {
        sendMessage("0");
    }

    private void sendMessage(String msg) {
        MqttClient client;
        try {
            client = new MqttClient("tcp://localhost:1883", "Blinds Remote");
            client.connect();
            MqttMessage message = new MqttMessage();
            message.setPayload(msg.getBytes());
            client.publish(stage, message);
            client.disconnect();
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }
}
