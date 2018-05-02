package AbstractFactoryPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/6 14:39
 * @Description: 第4步 创建实现相同接口Color的具体类。
 */

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
