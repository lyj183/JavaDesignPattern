package FlyweightPattern;

import java.util.HashMap;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/11 16:36
 * @Description: 第3步 创建一个工厂根据给定的信息生成具体类的对象。
 **/

public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
