package InterpreterPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/12 13:40
 * @Description: 第1步 创建表达式接口
 **/

public interface Expression {
    public boolean interpret(String context);
}
