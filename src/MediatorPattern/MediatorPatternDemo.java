package MediatorPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/12 13:36
 * @Description: 第3步 使用User对象显示它们之间的通信。
 **/

public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
