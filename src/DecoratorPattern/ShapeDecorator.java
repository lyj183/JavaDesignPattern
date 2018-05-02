package DecoratorPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/11 16:02
 * @Description: 第3步 创建实现Shape接口的抽象装饰器类。
 **/

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
