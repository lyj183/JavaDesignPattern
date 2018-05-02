package CommandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/12 10:58
 * @Description: 第4步 创建命令调用程序类。
 **/

public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order :
                orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
