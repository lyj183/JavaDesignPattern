package BuilderPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/6 15:39
 * @Description: 第2步 创建Packing接口的具体类（Wrapper 和 Bottle）。
 */

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
