package IteratorPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/12 11:16
 * @Description: 第3步 使用NameRepository获取迭代器并打印其名称。
 **/

public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext();) {
            String name = (String)iterator.next();
            System.out.println("Name: " + name);
        }
    }
}
