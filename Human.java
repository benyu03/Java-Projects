/**
 * Class decription
 *
 * @author Justin Kim
 * Fall 2023, ITP 265, Coffee
 * Email; jkim8918@usc.edu
 * Date Created: 11/7/23
 */
public class Human extends Being {

    private BloodType bloodType;

    public Human(String name, int quarts, String icon, BloodType type) {
        super(name, quarts, icon);
        this.bloodType = type;
    }

    public Human(String name, int quarts, BloodType type) {
        super(name, quarts);
        this.bloodType = type;
    }

    public Human(String name, String icon, BloodType type) {
        super(name, icon);
        this.bloodType = type;
    }

    public Human(String name, BloodType type) {
        super(name);
        this.bloodType = type;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public boolean suckBlood() {
        return decreaseQuarts(1);
    }

    @Override
    public String toString() {
        return super.toString() + " of blood type " + bloodType.name().replace("_", "+");
    }

    public static void main(String[] args) {
        Human human = new Human("Kendra", 5, "\uD83E\uDDD1\u200D\u2642\uFE0F", BloodType.A_POSITIVE);
        System.out.println(human);
        boolean result = human.suckBlood();
        System.out.println("Could suck blood: " + result);
        System.out.println(human);
    }
}
