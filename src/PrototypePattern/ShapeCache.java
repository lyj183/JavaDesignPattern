package PrototypePattern;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * 原型模式指在创建重复对象的同时保持性能。 这种类型的设计模式属于创建模式，因为此模式提供了创建对象的最佳方法之一。
 * 这个模式涉及实现一个原型接口，它只创建当前对象的克隆。
 * 有时直接创建对象时使用这种模式是昂贵的。例如，在昂贵的数据库操作之后创建对象。
 * 因此我们可以缓存对象，在下一个请求时返回其克隆，并在需要时更新数据库，从而减少数据库调用。
 * @author: linyijin
 * @Date: Created in 2017/12/6 16:48
 * @Description: 第3步 创建一个类来获取具体的类，并将它们存储在HashMap中。
 */

public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();
    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape)cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
