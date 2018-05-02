package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/6 15:58
 * @Description: 第5步 创建一个具有上面定义的Item对象（VegBurger，ChickenBurger 和 Coke，Pepsi）的Meal类。
 */

public class Meal {
    private List<Item> items = new ArrayList<Item>();
    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item :
                items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item :
                items) {
            System.out.print("Item: " + item.name());
            System.out.print(", Packing: " + item.packing().pack());
            System.out.println(", Price: " + item.price());
        }
    }
}
