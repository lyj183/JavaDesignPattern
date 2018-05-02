package BridgePattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/8 17:10
 * @Description: 第4步 创建实现Shape接口的具体类
 **/

public class Circle extends Shape {
    private int x, y, radius;
    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
