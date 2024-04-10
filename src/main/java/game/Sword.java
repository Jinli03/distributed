package game;

import lombok.Data;

import java.util.Random;

@Data
public class Sword implements Item {
    private int attack;
    private int defense;

    public Sword() {
        Random random = new Random();
        // 生成1到10之间的随机数
        this.attack = random.nextInt(10) + 1;
    }

    @Override
    public void apply(Player player) {
        player.setAttack(player.getAttack() + this.attack);
    }

    @Override
    public String getDescription() {
        return "Sword (Attack: " + attack + ", Defense: " + defense + ")";
    }

    // 省略其他方法
}
