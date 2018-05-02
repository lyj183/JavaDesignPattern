package ObserverPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/12 14:22
 * @Description: 第4步 使用 Subject 和具体的观察者对象。
 **/

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
