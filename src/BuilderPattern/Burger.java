package BuilderPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/6 15:43
 * @Description: 第3步 创建抽象类（Burger 和 ColdDrink）实现Item接口提供默认功能。
 */

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
