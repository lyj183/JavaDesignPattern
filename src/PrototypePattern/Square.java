package PrototypePattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/6 16:42
 * @Description: 第2步 创建 Shape 抽象类的具体类（Rectangle，Square 和 Circle）
 */

public class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }

    public Square() {
        type = "Square";
    }
}
