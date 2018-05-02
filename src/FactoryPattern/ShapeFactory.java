package FactoryPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/6 14:18
 * @Description: 第3步 创建工厂根据给定的信息生成具体类的对象。
 */

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
