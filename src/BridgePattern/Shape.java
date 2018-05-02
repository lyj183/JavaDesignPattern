package BridgePattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/8 17:08
 * @Description: 第3步 使用DrawAPI接口创建一个抽象类 (Shape)。
 **/

public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
