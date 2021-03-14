package maxwainer.pools;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import maxwainer.pools.api.CacheComponent;
import maxwainer.pools.api.RequestWrapper;
import maxwainer.pools.api.connection.PoolConnection;
import maxwainer.pools.api.utils.Applier;
import org.jetbrains.annotations.NotNull;
import redis.clients.jedis.Jedis;

public class RequestWrapperImpl implements RequestWrapper {
  private final PoolConnection connection;
  private final Jedis jedis;

  public RequestWrapperImpl(PoolConnection connection) {
    this.connection = connection;
    jedis = connection.getJedis();
  }

  @Override
  public void setString(@NotNull String name, @NotNull String value) {
    jedis.set(name, value);
  }

  @Override
  public Optional<String> getString(@NotNull String name) {
    return Optional.ofNullable(jedis.get(name));
  }

  @Override
  public void updateString(@NotNull String name, @NotNull Applier<String> applier) {
    String string = getString(name).orElse(null);

    if (string != null)
      setString(name, applier.apply(string));
  }

  @Override
  public void setInt(@NotNull String name, int value) {

  }

  @Override
  public OptionalInt getInt(@NotNull String name) {
    return OptionalInt.empty();
  }

  @Override
  public void updateInt(@NotNull String name, @NotNull Applier<Integer> applier) {

  }

  @Override
  public <R extends CacheComponent<R>> void setComponent(@NotNull String name, @NotNull R value) {

  }

  @Override
  public <R extends CacheComponent<R>> Optional<R> getComponent(@NotNull String name) {
    return Optional.empty();
  }

  @Override
  public <R extends CacheComponent<R>> void updateComponent(@NotNull String name,
      @NotNull Applier<R> applier) {

  }

  @Override
  public <R> void setList(@NotNull String name, @NotNull List<R> array) {

  }

  @Override
  public <R> Optional<List<R>> getList(@NotNull String name) {
    return Optional.empty();
  }

  @Override
  public <R> void updateList(@NotNull String name, @NotNull Applier<List<R>> applier) {

  }

  @Override
  public <K, V> void setMap(@NotNull String name, @NotNull Map<K, V> map) {

  }

  @Override
  public <K, V> Optional<Map<K, V>> getMap(@NotNull String name) {
    return Optional.empty();
  }

  @Override
  public <K, V> void updateMap(@NotNull String name, @NotNull Applier<Map<K, V>> applier) {

  }

  @Override
  public <R> void set(@NotNull String name, @NotNull R obj) {

  }

  @Override
  public <R> Optional<R> get(@NotNull String name) {
    return Optional.empty();
  }

  @Override
  public <R> void update(@NotNull String name, @NotNull Applier<R> applier) {

  }
}
