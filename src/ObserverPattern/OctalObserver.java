package ObserverPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/12 14:19
 * @Description: 第3步 创建具体的观察者类(BinaryObserver, OctalObserver 和 HexaObserver)。
 **/

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) );
    }
}
