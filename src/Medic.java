public class Medic extends Hero {
    public Medic(int heal, int damage, String superAbilities) {
        super(heal, damage, superAbilities);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        super.applySuperAbility(superAbilityType);
        superAbilityType = superAbilities;
        System.out.println("Суперспособность: " + superAbilityType);
    }
}
