package ChainPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/11 18:21
 * @Description: 第2步 创建几个扩展记录器的具体类(ConsoleLogger, ErrorLogger 和 FileLogger)。
 **/

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
