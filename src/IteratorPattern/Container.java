package IteratorPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/12 11:08
 * @Description: 第1步 创建两个简单的接口(Iterator 和 Container)。
 **/

public interface Container {
    public Iterator getIterator();
}
