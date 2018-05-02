package PrototypePattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/6 16:40
 * @Description: 第2步 创建 Shape 抽象类的具体类（Rectangle，Square 和 Circle）
 */

public class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }

    public Rectangle() {
        type = "Rectangle";
    }
}
