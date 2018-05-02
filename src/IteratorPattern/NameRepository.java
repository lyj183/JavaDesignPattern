package IteratorPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/12 11:11
 * @Description: 第2步 创建实现Container接口的具体类。 这个类有一个内部类NameIterator，它实现了Iterator接口。
 **/

public class NameRepository implements Container {
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
