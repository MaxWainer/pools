package maxwainer.pools;

import java.util.ArrayList;
import java.util.List;
import maxwainer.pools.api.client.Pool;
import maxwainer.pools.api.connection.PoolConnection;
import maxwainer.pools.api.utils.Request;
import org.jetbrains.annotations.NotNull;

public class SimplePool implements Pool<RequestWrapperImpl, PoolClientImpl> {
  private final List<PoolClientImpl> clients = new ArrayList<>();
  private final PoolConnection connection;

  public SimplePool(PoolConnection connection) {
    this.connection = connection;
  }

  @Override
  public @NotNull List<PoolClientImpl> getClients() {
    return clients;
  }

  @Override
  public @NotNull PoolConnection getConnection() {
    return null;
  }

  @Override
  public void createClient(PoolClientImpl client) {
    if (!clients.contains(client))
      clients.add(client);
  }

  @Override
  public void createRequest(Request<RequestWrapperImpl> request) {
    request.executeRequest(new RequestWrapperImpl(connection));
  }

}
