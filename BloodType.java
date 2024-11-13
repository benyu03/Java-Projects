/**
 * Class decription
 *
 * @author Justin Kim
 * Fall 2023, ITP 265, Coffee
 * Email; jkim8918@usc.edu
 * Date Created: 11/7/23
 */
public enum BloodType {
    O_POSITIVE ("O+"),
    O_NEGATIVE ("O-"),
    A_POSITIVE ("A+"),
    A_NEGATIVE ("A-"),
    B_POSITIVE ("B+"),
    B_NEGATIVE ("B-"),
    AB_POSITIVE ("AB+"),
    AB_NEGATIVE ("AB-");
    private final String option;

    BloodType(String option) {
        this.option = option;
    }

    public String getOption(){
        return option;
    }
    public static BloodType getRandom(){
        return BloodType.values()[(int)(Math.random() * BloodType.values().length)];
    }

    public static String[] getBloodTypeStringsAsArray(){
        String[] array = new String[BloodType.values().length];
        for(int i = 0; i < BloodType.values().length; i++){
            array[i] = BloodType.values()[i].getOption();
        }
        return array;
    }
    public static BloodType matchString(String type) {
        BloodType bType = O_NEGATIVE;
        for (BloodType b : BloodType.values()) {
            if (b.getOption().equalsIgnoreCase(type)) {
                bType = b;
            }
        }
        return bType;
    }
}
