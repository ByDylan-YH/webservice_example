package example;

import example.client.HelloWorldServiceLocator;
import example.client.HelloWorld_PortType;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

/**
 * Author:BYDylan
 * Date:2020/8/12
 * Description:
 * 构建web service需要jar包
 * http://www.eclipse.org/webtools/wst/components/ws/download_instructions_for_jars.html
 */
public class HelloWorldClient {
    public static void main(String[] argv) {
        try {
            HelloWorldServiceLocator locator = new HelloWorldServiceLocator();
            // If authorization is required
            //((MyService_Soap_BindingStub)service).setUsername("user3");
            //((MyService_Soap_BindingStub)service).setPassword("pass3");
            // invoke business method
            HelloWorld_PortType helloWorld = locator.getHelloWorld();
            System.out.println(helloWorld.sayHelloWorldFrom("Web Service"));
        } catch (ServiceException | RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
