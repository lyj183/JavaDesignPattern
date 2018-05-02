package AbstractFactoryPattern;

/**
 * 抽象工厂模式是一个超级工厂，用来创建其他工厂。 这个工厂也被称为工厂的工厂。 这种类型的设计模式属于创建模式，因为此模式提供了创建对象的最佳方法之一。
 * 在抽象工厂模式中，接口负责创建相关对象的工厂，而不明确指定它们的类。 每个生成的工厂可以按照工厂模式提供对象。
 * @author: linyijin
 * @Date: Created in 2017/12/6 14:56
 * @Description: 第8步 使用FactoryProducer来获取AbstractFactory，以便通过传递类型等信息来获取具体类的工厂。
 */

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color color1 = colorFactory.getColor("RED");
        color1.fill();
        Color color2 = colorFactory.getColor("Green");
        color2.fill();
        Color color3 = colorFactory.getColor("BLUE");
        color3.fill();
    }
}
