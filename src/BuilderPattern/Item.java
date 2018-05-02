package BuilderPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/6 15:35
 * @Description: 第1步 创建两个接口分别代表食品和包装的项目（Packing 和 Item）。
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
