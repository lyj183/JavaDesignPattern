package CommandPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/12 11:03
 * @Description: 第5步 使用Broker类来接收和执行命令。
 **/

public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
