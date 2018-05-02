package ObserverPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/12 14:20
 * @Description: 第3步 创建具体的观察者类(BinaryObserver, OctalObserver 和 HexaObserver)。
 **/

public class HexaObserver extends Observer {

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
