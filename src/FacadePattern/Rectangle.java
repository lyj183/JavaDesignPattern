package FacadePattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/11 16:20
 * @Description: 第2步 创建实现几个相同接口的具体类(Rectangle, Square 和 Circle)
 **/

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
