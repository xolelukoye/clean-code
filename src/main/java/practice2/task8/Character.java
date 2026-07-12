package practice2.task8;

public class Character {

    private int health;
    private int damage;
    private int armor;
    private int mana;

    private Character(CharacterBuilder characterBuilder) {
        this.health = characterBuilder.health;
        this.damage = characterBuilder.damage;
        this.armor = characterBuilder.armor;
        this.mana = characterBuilder.mana;
    }

    static class CharacterBuilder {

        private int health;
        private int damage;
        private int armor;
        private int mana;

        public CharacterBuilder setHealth(int health) {
            this.health = health;
            return this;
        }

        public CharacterBuilder setDamage(int damage) {
            this.damage = damage;
            return this;
        }

        public CharacterBuilder setArmor(int armor) {
            this.armor = armor;
            return this;
        }

        public CharacterBuilder setMana(int mana) {
            this.mana = mana;
            return this;
        }

        public Character build() {
            return new Character(this);
        }
    }
}
