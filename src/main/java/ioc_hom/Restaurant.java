package ioc_hom;

import lombok.Data;

@Data
public class Restaurant {
    private Food food;

    public void order () {
        System.out.println("客人点了一份" + food.getClass().getSimpleName());
        System.out.println("上菜");
        food.eat();
    }

}
