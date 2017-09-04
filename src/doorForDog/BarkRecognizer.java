package doorForDog;

import java.util.ArrayList;

/**
 * Created by Digital Anvil on 19.08.2017.
 */
public class BarkRecognizer {
    private DogDoor door;

    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public void recognize(Bark bark) {
        System.out.println("   Bark Recognizer: Heard a `" + bark.getSound() + "`");
        ArrayList<Bark> barks = door.getAllowedBarks();
        boolean isRecognized = false;

//        if (barks.contains(bark)) {
//            door.open();
//        } else {
//            System.out.println("This dog is not allowed.");
//        }

        for (Bark currentBark : barks) {
            if (bark.equals(currentBark)) {
                door.open();
                isRecognized = true;
                break;
            }
        }
        if (!isRecognized) System.out.println("This dog is not allowed.");
    }
}
