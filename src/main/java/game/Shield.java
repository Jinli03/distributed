package game;

import lombok.Data;

import java.util.Random;

@Data
public class Shield implements Item {
    private int attack;
    private int defense;

    public Shield() {
        Random random = new Random();

        this.defense = random.nextInt(10) + 1;
    }

    @Override
    public void apply(Player player) {
        player.setHealth(player.getHealth() + this.defense);
    }

    @Override
    public String getDescription() {
        return "Shield (Attack: " + attack + ", Defense: " + defense + ")";
    }

}