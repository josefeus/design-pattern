package josefeus.patterns.structural.proxy.dynamicProxy;

/**
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/09/10 22:06
 */
public interface Http {
    void request(String sendData);

    void onSuccess(String receiveData);
}
