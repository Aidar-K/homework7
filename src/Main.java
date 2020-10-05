import java.awt.event.WindowAdapter;

public class Main {

    public static void main(String[] args) {
        Magic magic = new Magic(150, 50, "FIRE STORM");
        magic.applySuperAbility(magic.superAbilities);

        Medic medic = new Medic(200, 10, "MEGA HEAL");
        medic.applySuperAbility(medic.superAbilities);
        
        Warrior warrior = new Warrior(180, 60, "BOOM SHOT");
        warrior.applySuperAbility(warrior.superAbilities);

        Hero[] heroes = {magic, medic, warrior};
        for (int i = 0; i < 3; i++) {
            System.out.println();
        }
    }
}
