package maxwainer.pools;

import maxwainer.pools.api.client.PoolClient;
import org.jetbrains.annotations.NotNull;

public class PoolClientImpl implements PoolClient<SimplePool> {

  @Override
  public @NotNull String getClientName() {
    return null;
  }

  @Override
  public @NotNull String getClientPassword() {
    return null;
  }

  @Override
  public @NotNull String getClientPoolName() {
    return null;
  }

  @Override
  public @NotNull SimplePool getClientPool() {
    return null;
  }

  @Override
  public boolean compare(@NotNull PoolClient o) {
    return false;
  }
}
