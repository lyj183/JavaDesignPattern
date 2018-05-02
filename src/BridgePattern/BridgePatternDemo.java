package BridgePattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/8 17:14
 * @Description: 第5步 使用Shape和DrawAPI类来绘制不同的彩色圆形
 **/

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
