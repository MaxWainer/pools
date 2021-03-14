package maxwainer.pools;

import maxwainer.pools.api.connection.PoolConnection;
import org.jetbrains.annotations.NotNull;
import redis.clients.jedis.Jedis;

public class PoolConnectionImpl implements PoolConnection {

  @Override
  public @NotNull Jedis getJedis() {
    return null;
  }

  @Override
  public boolean compare(@NotNull PoolConnection o) {
    return false;
  }
}
