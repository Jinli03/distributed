package game;

import org.springframework.stereotype.Component;

@Component
public class Battle {

    public void start(Player player, Monster monster) {

        System.out.println("突然跳出了一个怪物");
        System.out.println(monster);
        System.out.println("战斗开始了！");
        while (player.getHealth() > 0 && monster.getHealth() > 0) {
            System.out.println("你发起了攻击");
            playerAttack(player, monster);
            if (monster.getHealth() <= 0) {
                System.out.println("你战胜了怪物！");
                break;
            }
            System.out.println("怪兽发起了攻击");
            monsterAttack(player, monster);
            if (player.getHealth() <= 0) {
                System.out.println("胜败乃兵家常事，大侠请重来！");
                break;
            }
        }
    }

    // 省略其他方法

    private static void playerAttack(Player player, Monster monster) {
        monster.setHealth(monster.getHealth() - player.getAttack());
        System.out.println(monster);
    }

    private static void monsterAttack(Player player, Monster monster) {
        player.setHealth(player.getHealth() - monster.getAttack());
        System.out.println(player);
    }
}
