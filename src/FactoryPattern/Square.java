package FactoryPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/6 14:15
 * @Description: 第2步 创建实现相同接口的具体类。
 */

public class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
