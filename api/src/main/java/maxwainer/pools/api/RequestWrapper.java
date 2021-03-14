package maxwainer.pools.api;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import org.jetbrains.annotations.NotNull;
import maxwainer.pools.api.utils.Applier;

/**
 * Simplifying getting/setting values
 * */
public interface RequestWrapper {

  void setString(@NotNull String name, @NotNull String value);

  Optional<String> getString(@NotNull String name);

  void updateString(@NotNull String name, @NotNull Applier<String> applier);


  void setInt(@NotNull String name, int value);

  OptionalInt getInt(@NotNull String name);

  void updateInt(@NotNull String name, @NotNull Applier<Integer> applier);


  <R extends CacheComponent<R>> void setComponent(@NotNull String name, @NotNull R value);

  <R extends CacheComponent<R>> Optional<R> getComponent(@NotNull String name);

  <R extends CacheComponent<R>> void updateComponent(@NotNull String name, @NotNull Applier<R> applier);


  <R> void setList(@NotNull String name, @NotNull List<R> array);

  <R> Optional<List<R>> getList(@NotNull String name);

  <R> void updateList(@NotNull String name, @NotNull Applier<List<R>> applier);


  <K, V> void setMap(@NotNull String name, @NotNull Map<K, V> map);

  <K, V> Optional<Map<K, V>> getMap(@NotNull String name);

  <K, V> void updateMap(@NotNull String name, @NotNull Applier<Map<K, V>> applier);


  <R> void set(@NotNull String name, @NotNull R obj);

  <R> Optional<R> get(@NotNull String name);

  <R> void update(@NotNull String name, @NotNull Applier<R> applier);

}
