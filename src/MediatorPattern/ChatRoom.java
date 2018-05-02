package MediatorPattern;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.Date;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/12 11:26
 * @Description: 第1步 创建一个聊天室类。
 **/

public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
