package DecoratorPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/11 16:05
 * @Description: 第4步 创建扩展ShapeDecorator类的具体装饰器类。
 **/

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
