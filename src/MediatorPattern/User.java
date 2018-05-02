package MediatorPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/12 13:32
 * @Description: 第2步 创建一个用户类
 **/

public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
