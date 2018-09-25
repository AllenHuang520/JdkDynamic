import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2018/9/24.
 *
 */
public class sportActive implements InvocationHandler {

    private Object factory;


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("尼玛high1");
        Object ret = method.invoke(factory,args);
        System.out.println("尼玛high2");
        return ret;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(factory.getClass().getClassLoader(),factory.getClass().getInterfaces(),this);
    }

    public Object getFactory() {
        return factory;
    }

    public void setFactory(Object factory) {
        this.factory = factory;
    }
}
