package MementoPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/12 14:02
 * @Description: 第3步 创建一个CareTaker类
 **/

public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();
    public void add(Memento state) {
        mementoList.add(state);
    }
    public Memento get(int index) {
        return mementoList.get(index);
    }
}
