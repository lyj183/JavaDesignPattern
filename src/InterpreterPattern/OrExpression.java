package InterpreterPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/12 13:46
 * @Description: 第2步 创建实现上述接口的具体类(TerminalExpression, OrExpression 和 AndExpression)。
 **/

public class OrExpression implements Expression {
    private Expression expression1 = null;
    private Expression expression2 = null;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context) || expression2.interpret(context);
    }
}
