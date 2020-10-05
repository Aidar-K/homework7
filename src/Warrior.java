public class Warrior extends Hero {
    public Warrior(int heal, int damage, String superAbilities) {
        super(heal, damage, superAbilities);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        super.superAbilities.length();
        superAbilityType = superAbilities;
        System.out.println("Суперспособность: " + superAbilityType);
    }
}
