package ObserverPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/12 14:10
 * @Description: 第2步 创建一个 Observer 类
 **/

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
