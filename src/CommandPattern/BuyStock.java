package CommandPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/12 10:53
 * @Description: 第3步 创建实现Order接口的具体类(BuyStock 和 SellStock)。
 **/
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
