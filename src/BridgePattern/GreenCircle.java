package BridgePattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/8 17:06
 * @Description: 第2步 创建实现DrawAPI接口的具体桥接实现者类(RedCircle 和 GreenCircle)
 **/

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
