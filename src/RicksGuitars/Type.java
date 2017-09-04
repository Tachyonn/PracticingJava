package RicksGuitars;

/**
 * Created by Digital Anvil on 23.08.2017.
 */
public enum Type {

    ELECTRIC, ACOUSTIC;

    @Override
    public String toString() {
        switch (this) {
            case ELECTRIC:
                return "Electric";
            case ACOUSTIC:
                return "Acoustic";
            default:
                return super.toString();
        }
    }
}