package cuartaIteracion;

import java.util.Map;

public class ServiceLocator {
  private static Map<String, Object> services;

  public static void setService(String key, Object service) {
    services.put(key, service);
  }
  public static Object getService(String key) {
    return services.get(key);
  }
}
