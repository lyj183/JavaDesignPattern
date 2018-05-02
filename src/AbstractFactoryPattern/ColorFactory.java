package AbstractFactoryPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/6 14:49
 * @Description: 第6步 创建工厂类，根据给定信息扩展AbstractFactory以生成具体类的对象。
 */

public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
