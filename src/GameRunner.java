import classes.characters.Archer;
import classes.characters.Healer;
import classes.characters.Mage;
import classes.characters.Warrior;

public class GameRunner {
    public static void main(String[] args) {
        Party party = new Party(new Mage("Gendalf"), new Warrior("Aragon"), new Archer("Legolas"), new Healer("Radogast"));
        party.info();
    }
}
