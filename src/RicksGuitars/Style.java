package RicksGuitars;

/**
 * Created by Digital Anvil on 23.08.2017.
 */
public enum Style {
    TYPE_A, TYPE_F;

    @Override
    public String toString() {
        switch (this) {
            case TYPE_A:
                return "Type A";
            case TYPE_F:
                return "Type F";
            default:
                return super.toString();
        }
    }
}
