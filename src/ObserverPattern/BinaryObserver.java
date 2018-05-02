package ObserverPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/12 14:15
 * @Description: 第3步 创建具体的观察者类(BinaryObserver, OctalObserver 和 HexaObserver)。
 **/

public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) );
    }
}
