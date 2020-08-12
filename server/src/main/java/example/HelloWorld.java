package example;

/**
 * Author:BYDylan
 * Date:2020/8/12
 * Description:服务端
 */
public class HelloWorld {
    public String sayHelloWorldFrom(String from) {
        String result = "Hello," + from;
        System.out.println(result);
        return result;
    }
}
