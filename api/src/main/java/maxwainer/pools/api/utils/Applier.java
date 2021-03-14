package maxwainer.pools.api.utils;

import java.util.function.Function;

@FunctionalInterface
public interface Applier<T> extends Function<T, T> {

  @Override
  T apply(T t);

}
