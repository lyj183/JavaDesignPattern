package AbstractFactoryPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/6 14:13
 * @Description: 第2步 创建实现相同接口Shape的具体类。
 */

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
