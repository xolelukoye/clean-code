package practice2.task8;

public class Game {

    public Character createCharacter() {
        return new Character.CharacterBuilder()
                .setHealth(100)
                .setDamage(30)
                .setArmor(80)
                .setMana(50)
                .build();
    }
}
