package josefeus.patterns.structural.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/09/10 22:08
 */
public class HttpProxy implements InvocationHandler {
    private Http http;

    public Http getInstance(Http http) {
        this.http = http;
        return (Http) Proxy.newProxyInstance(http.getClass().getClassLoader(),
                http.getClass().getInterfaces(), this);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        // proxy and this has different meanings
        System.out.println("proxy: " + proxy.getClass().getName());
        System.out.println("this: " + this.getClass().getName());
        switch (method.getName()) {
            case "request":
                System.out.println("send data: " + args[0]);
                result = method.invoke(http, args);
                break;
            case "onSuccess":
                System.out.println("receive data: " + args[0]);
                result = method.invoke(http, args);
                break;
            default:
                throw new Exception("method not found");
        }
        return result;
    }

    public static void main(String[] args) {
        HttpImpl http = new HttpImpl();
        Http proxy = new HttpProxy().getInstance(http);
        proxy.request("123");
        proxy.onSuccess("456");
    }
}
