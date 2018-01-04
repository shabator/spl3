package bgu.spl181.net.api.bidi;

public class BidiMessagingProtocolImpl implements BidiMessagingProtocol<String> {

    private int connectionId;
    private Connections connections;
    private boolean shouldTerminate = false;

    void start(int connectionId, Connections<String> connections){
        this.connectionId = connectionId;
        this.connections = connections;
    }

    void process(String message){
        shouldTerminate = message.equals("SIGNOUT");
        connections.send(connectionId, message);
    }

    /**
     * @return true if the connection should be terminated
     */
    boolean shouldTerminate(){
        return shouldTerminate;

    }
}
