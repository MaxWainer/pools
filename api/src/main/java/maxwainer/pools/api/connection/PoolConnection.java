package maxwainer.pools.api.connection;

import maxwainer.pools.api.utils.Compare;
import org.jetbrains.annotations.NotNull;
import redis.clients.jedis.Jedis;

public interface PoolConnection extends Compare<PoolConnection> {

  @NotNull Jedis getJedis();

}
