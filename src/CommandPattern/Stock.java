package CommandPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/12 10:51
 * @Description: 第2步 创建一个请求对象
 **/

public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }
}
