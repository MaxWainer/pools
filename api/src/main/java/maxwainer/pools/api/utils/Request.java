package maxwainer.pools.api.utils;

import maxwainer.pools.api.RequestWrapper;

public interface Request<R extends RequestWrapper> {

  void executeRequest(R wrapper);

}
