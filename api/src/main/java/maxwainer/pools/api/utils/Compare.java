package maxwainer.pools.api.utils;

import org.jetbrains.annotations.NotNull;

public interface Compare<T> extends Comparable<T> {

  @Override
  default int compareTo(@NotNull T o) {
    return compare(o) ? 1 : 0;
  }

  boolean compare(@NotNull T o);

}
