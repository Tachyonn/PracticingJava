package doorForDog;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Digital Anvil on 19.08.2017.
 */
public class Remote {
    private DogDoor door;

    public Remote(DogDoor door) {
        this.door = door;
    }

    public void pressButton() {
        System.out.println("Pressing the remote control button...");
        if (!door.isOpen()) {
            door.open();
        } else {
            door.close();
        }

    }
}
