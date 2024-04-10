package game;

import lombok.Data;

import java.util.Random;

@Data
public class Monster implements Character{
    private int health;
    private int attack;

    public Monster() {
        Random random = new Random();
        this.health = random.nextInt(10) + 1;
        this.attack = random.nextInt(10) + 1;
    }

    @Override
    public void useItem() {
        // 实现使用道具的逻辑，这里暂时留空
    }

    @Override
    public void battle(Character opponent) {
        // 实现战斗逻辑，这里暂时留空
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getAttack() {
        return attack;
    }
}
