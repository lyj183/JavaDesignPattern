package MementoPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/12 13:56
 * @Description: 第1步 创建一个Memento类
 **/

public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
