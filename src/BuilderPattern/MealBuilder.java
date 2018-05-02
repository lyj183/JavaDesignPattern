package BuilderPattern;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/6 16:13
 * @Description: 第6步 创建一个 MealBuilder 类，这是一个实际的构建类，负责创建Meal对象。
 */

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
