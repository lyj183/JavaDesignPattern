package FacadePattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/11 16:23
 * @Description: 第2步 创建实现几个相同接口的具体类(Rectangle, Square 和 Circle)
 **/

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
