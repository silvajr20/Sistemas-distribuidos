package server_client.server.repository;

import server_client.model.Message;

public interface MessageRepository {

    Message create(Message message);

    Message delete(Message message);

    boolean existId(long id);

    Message read(Message message);

    Message update(Message message);

}
