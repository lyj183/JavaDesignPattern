package CommandPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/12 10:55
 * @Description: 第3步 创建实现Order接口的具体类(BuyStock 和 SellStock)。
 **/

public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
