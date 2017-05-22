package sample;

/**
 * Created by jonasschmides on 22.05.17.
 * Übung5 - ProxyPattern
 */
interface State {

    public State isOnTop();

    public State isOnBottom();

    public State isBetween();
}
