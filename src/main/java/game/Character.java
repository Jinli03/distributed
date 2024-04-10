package game;

public interface Character {
    void useItem();
    void battle(Character opponent);
    void takeDamage(int damage);
    int getHealth();
    int getAttack();
}
