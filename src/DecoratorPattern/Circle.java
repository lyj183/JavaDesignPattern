package DecoratorPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/11 16:00
 * @Description: 第2步 创建两个实现相同接口的具体类(Rectangle 和 Circle)。
 **/

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
