package ioc_hom;

import java.lang.reflect.InvocationTargetException;

public class Kitchen {

    public static Food getFoodName (String name) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> food = Class.forName(name);
        return (Food) food.getDeclaredConstructor().newInstance();
    }
}
