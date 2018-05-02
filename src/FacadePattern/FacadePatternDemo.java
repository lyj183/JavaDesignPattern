package FacadePattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/11 16:26
 * @Description: 第4步 使用装饰类来绘制各种类型的形状。
 **/

public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
