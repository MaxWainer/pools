package maxwainer.pools.api.client;

import java.util.List;
import maxwainer.pools.api.RequestWrapper;
import maxwainer.pools.api.connection.PoolConnection;
import maxwainer.pools.api.utils.Request;
import org.jetbrains.annotations.NotNull;

public interface Pool<R extends RequestWrapper, P extends PoolClient> {

  @NotNull List<P> getClients();

  @NotNull PoolConnection getConnection();

  void createClient(P client);

  void createRequest(Request<R> request);

}
