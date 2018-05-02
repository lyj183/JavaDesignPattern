package SingletonPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/6 15:13
 * @Description: 第1步 创建一个Singleton类。
 */

public class SingleObject {
    //create an object of SingleObject
    private static SingleObject singleObject = new SingleObject();
    //make the constructor private so that this class cannot be instantiated
    private SingleObject() {}
    //Get the only object available
    public static SingleObject getInstance() {
        return singleObject;
    }
    public void showMessage() {
        System.out.println("Hello Singleton");
    }
}
