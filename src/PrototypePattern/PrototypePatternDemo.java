package PrototypePattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/6 17:10
 * @Description: 第4步 PrototypePatternDemo 使用 ShapeCache 类来获取存储在 Hashtable 中的形状（shape）的克隆。
 **/

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape1 = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape: " + clonedShape1.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape: " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape: " + clonedShape3.getType());
    }
}
