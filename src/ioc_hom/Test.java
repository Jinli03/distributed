package ioc_hom;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        System.out.println("欢迎光临老爹餐厅！");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要点的餐品");
        String foodName = sc.nextLine();
        Restaurant restaurant = new Restaurant();
        String fullClassName = "ioc_hom." + foodName;
        restaurant.setFood(Kitchen.getFoodName(fullClassName));
        restaurant.order();
    }
}
