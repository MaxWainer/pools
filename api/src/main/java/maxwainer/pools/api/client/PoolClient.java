package maxwainer.pools.api.client;

import maxwainer.pools.api.utils.Compare;
import org.jetbrains.annotations.NotNull;

public interface PoolClient<T extends Pool> extends Compare<PoolClient> {

  @NotNull String getClientName();

  @NotNull String getClientPassword();

  @NotNull String getClientPoolName();

  @NotNull T getClientPool();

}
