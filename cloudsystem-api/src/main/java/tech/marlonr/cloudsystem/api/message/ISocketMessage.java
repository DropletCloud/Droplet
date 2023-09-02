package tech.marlonr.cloudsystem.api.message;

/**
 * object for incoming and outgoing messages
 */
public interface ISocketMessage {

    /**
     * @return the name of the message
     */
    String getName();

    /**
     * @return the content of the message
     */
    String getContent();
}
