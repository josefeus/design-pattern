package josefeus.patterns.structural.proxy.dynamicProxy;

/**
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/09/10 22:07
 */
public class HttpImpl implements Http {
    @Override
    public void request(String sendData) {
        System.out.println("network request");
    }

    @Override
    public void onSuccess(String receiveData) {
        System.out.println("network request finished");
    }
}
