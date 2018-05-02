package InterpreterPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/12 13:43
 * @Description: 第2步 创建实现上述接口的具体类(TerminalExpression, OrExpression 和 AndExpression)。
 **/
public class TerminalExpression implements Expression {
    private String data;
    public TerminalExpression(String data) {
        this.data = data;
    }
    @Override
    public boolean interpret(String context) {
        if (context.contains(data)){
            return true;
        }
        return false;
    }
}
