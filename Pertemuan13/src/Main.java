public class Main {
    public static void main(String[] args) {
        Potion attackPotion = new Potion("Attack Potion", "A", 50.0, 5, 20, "Attack");
        Potion healPotion = new Potion("Heal Potion", "B", 30.0, 3, 15, "Heal");
        Sword sword = new Sword("Excalibur", "S", 100.0, 25);
        Shield shield = new Shield("Dragon Shield", "S", 80.0, 30);

        attackPotion.use();
        healPotion.use();
        sword.attack();
        shield.defense();
    }
}
