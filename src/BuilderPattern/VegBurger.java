package BuilderPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/6 15:51
 * @Description: 第4步 创建抽象类（Burger 和 ColdDrink）的具体类（VegBurger，ChickenBurger 和 Coke，Pepsi）。
 */

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
