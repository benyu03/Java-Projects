/**
 * Class decription
 *
 * @author Justin Kim
 * Fall 2023, ITP 265, Coffee
 * Email; jkim8918@usc.edu
 * Date Created: 11/7/23
 */
public enum VampireForm {
    VAMPIRE("🧛🏼", "Vampire", 3, 1, 2),
    VAMPIRE_BAT("🦇", "Vampire_Bat", 1, 2, 3),
    VAMPIRE_WOLF("🐺", "Vampire_Wolf", 2, 3, 1);
    private String emoji;
    private String form;
    private int garlicDamage;
    private int crossDamage;
    private int sunlightDamage;

    private VampireForm(String icon, String form, int garlic, int cross, int sun){
        this.emoji = icon;
        this.form = form;
        this.garlicDamage = garlic;
        this.crossDamage = cross;
        this.sunlightDamage = sun;
    }

    public String getEmoji(){
        return emoji;
    }
    public String getForm(){
        return form;
    }

    public static VampireForm getWinner(VampireForm p1, VampireForm p2) {
        VampireForm winner;
        if(p1 == p2) winner = p1; // This will result in a tie
            // Vampire beats the bat
        else if(p1 == VampireForm.VAMPIRE && p2 == VampireForm.VAMPIRE_BAT ||
                p1 == VampireForm.VAMPIRE_BAT && p2 == VampireForm.VAMPIRE) {
            winner = VampireForm.VAMPIRE;
        }
        // Bat will beat the Wolf
        else if(p1 == VampireForm.VAMPIRE_BAT && p2 == VampireForm.VAMPIRE_WOLF ||
                p1 == VampireForm.VAMPIRE_WOLF && p2 == VampireForm.VAMPIRE_BAT) {
            winner = VampireForm.VAMPIRE_BAT;
        }
        // Wolf will beat the vampire
        else {
            winner = VampireForm.VAMPIRE_WOLF;
        }
        return winner;
    }

    public int getDamage(String item) {
        int damage = 0;
        if(item.equalsIgnoreCase("garlic")){
            damage =  garlicDamage;
        }
        else if(item.equalsIgnoreCase("cross")){
            damage = crossDamage;
        }
        else if(item.equalsIgnoreCase("sunlight")){
            damage =  sunlightDamage;
        }
        return damage;
    }
}
