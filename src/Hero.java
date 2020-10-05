public abstract class Hero implements HavingSuperAbility {
    public int Health;
    public int Damage;
    public String superAbilities;

    public Hero(int health, int damage, String superAbilities) {
        this.Health = health;
        this.Damage = damage;
        this.superAbilities = superAbilities;
    }
    @Override
    public void applySuperAbility(String superAbilityType) {

    }
}
