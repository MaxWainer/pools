package maxwainer.pools.api;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;

public interface CacheComponent<T> extends Comparable<T>, JsonSerializer<T>, JsonDeserializer<T> {

  @NotNull T getComponent();

  void setComponent(T newValue);

  @Override
  T deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException;

  @Override
  JsonElement serialize(T src, Type typeOfSrc, JsonSerializationContext context);

  @Override
  int compareTo(@NotNull T o);

}
