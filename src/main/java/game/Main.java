package game;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("game.xml");
        Player player = new Player();
        Monster monster = new Monster();
        System.out.println(player);
        Battle battle = context.getBean(Battle.class);
        String[] itemIds = context.getBeanNamesForType(Item.class);
        Item item = getRandomItem(context, itemIds);
        System.out.println("随机获取的道具属性：");
        System.out.println(item.getDescription());
        item.apply(player);
        System.out.println(player);
        battle.start(player, monster);
    }
    private static Item getRandomItem(ApplicationContext context, String[] itemIds) {
        Random random = new Random();
        int randomIndex = random.nextInt(itemIds.length);
        String randomItemId = itemIds[randomIndex];
        return (Item) context.getBean(randomItemId);
    }
}
