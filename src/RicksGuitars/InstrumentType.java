package RicksGuitars;

/**
 * Created by Digital Anvil on 28.08.2017.
 */
public enum InstrumentType {
    GUITAR, MANDOLIN, BASS, BANJO, DOBRO, FIDDLE;


    @Override
    public String toString() {
        switch (this) {
            case GUITAR:
                return "Guitar";
            case MANDOLIN:
                return "Mandolin";
            case BASS:
                return "Bass";
            case BANJO:
                return "Banjo";
            case DOBRO:
                return "Dobro";
            case FIDDLE:
                return "Fiddle";
            default:
                return "Unspecified";
        }
    }
}
