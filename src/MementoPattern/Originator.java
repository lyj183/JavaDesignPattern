package MementoPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/12 13:58
 * @Description: 第2步 创建一个Originator类。
 **/

public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
