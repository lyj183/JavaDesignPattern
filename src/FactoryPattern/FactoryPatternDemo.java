package FactoryPattern;

/**
 * 工厂模式是Java中最常用的设计模式之一。 这种类型的设计模式属于创建模式，因为此模式提供了创建对象的最佳方法之一。
 * 在工厂模式中，我们没有创建逻辑暴露给客户端创建对象，并使用一个通用的接口引用新创建的对象。
 *
 * @author: linyijin
 * @Date: Created in 2017/12/6 14:25
 * @Description: 第4步 使用工厂通过传递类型等信息来获取具体类的对象。
 */

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}
