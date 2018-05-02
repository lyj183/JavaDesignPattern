package AbstractFactoryPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/6 14:42
 * @Description: 第5步 创建抽象工厂。
 */

public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
