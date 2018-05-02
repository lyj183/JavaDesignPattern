package BuilderPattern;

/**
 * 构建器（Builder）模式使用简单对象并使用逐步方法构建复杂对象。 这种类型的设计模式属于创建模式，因为此模式提供了创建对象的最佳方法之一。
 * 构建器（Builder）模式构建器逐步构建最终对象，此构建器独立于其他对象。
 * 实例：
 * 1、我们考虑了一家快餐店的商业案例，其中典型的餐点可能是汉堡和冷饮。
 * 2、汉堡可以是一个素食汉堡或鸡肉汉堡，将被包装进行包装。
 * 3、冷饮可以是一个可乐或百事将装放在一个瓶子中。
 * @author: linyijin
 * @Date: Created in 2017/12/6 16:19
 * @Description: 第7步 BuiderPatternDemo 类使用 MealBuider 对象来演示构建器模式。
 */

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}
