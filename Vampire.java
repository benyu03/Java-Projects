/**
 * Class decription
 *
 * @author Justin Kim
 * Fall 2023, ITP 265, Coffee
 * Email; jkim8918@usc.edu
 * Date Created: 11/7/23
 */
public class Vampire extends Being {

    private VampireForm form;
    private int points;
    private BloodType favBlood1;
    private BloodType favBlood2;

    public Vampire(String name, int quarts, VampireForm form, BloodType type1, BloodType type2) {
        super(name, quarts, form.getEmoji());
        this.form = form;
        this.points = 10; // Set points to 10
        this.favBlood1 = type1;
        this.favBlood2 = type2;

        // Ensure the blood types are different
        while(favBlood1 == favBlood2) {
            favBlood2 = BloodType.getRandom();
        }
    }

    public Vampire(String name, int quarts, VampireForm form) {
        this(name, quarts, form, BloodType.getRandom(), BloodType.getRandom());
    }

    public Vampire(String name, int quarts) {
        this(name, quarts, VampireForm.VAMPIRE);
    }

    public Vampire(String name) {
        this(name, DEFAULT_NUM_QUARTS, VampireForm.VAMPIRE);
    }

    public Vampire(String name, VampireForm form) {
        this(name, DEFAULT_NUM_QUARTS, form);
    }

    public BloodType getFavBlood1() {
        return favBlood1;
    }

    public BloodType getFavBlood2() {
        return favBlood2;
    }

    public VampireForm getForm() {
        return form;
    }

    public int getPoints() {
        return points;
    }

    public void changeForm(){
        VampireForm[] forms = VampireForm.values();

        VampireForm newForm;

        do {
            newForm = forms[(int) (Math.random() * forms.length)];
        } while(newForm == this.form);

        changeForm(newForm);
    }

    public void changeForm(VampireForm nextForm) {
        setForm(nextForm);
    }

    private void setForm(VampireForm nextForm) {
        this.form = nextForm;
        this.icon = nextForm.getEmoji(); // Update the icon based on form
    }

    public void earnPoints(int num) {
        this.points += num;
    }

    public void losePoints(int num) {
        this.points -= num;
    }

    public void suckBlood() {
        increaseQuarts(1);
    }

    @Override
    public String toString() {
        return "Vampire " + super.toString();
    }
    public String getDisplay(){
        return getIcon() + " " + getName() + " " + getIcon();
    }
}

