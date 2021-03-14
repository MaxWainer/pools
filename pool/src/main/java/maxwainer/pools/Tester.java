package maxwainer.pools;

public class Tester {

  public static void main(String[] args) {
    SimplePool pool = new SimplePool(new PoolConnectionImpl());

    pool.createRequest(request -> {
      
    });

  }

}
