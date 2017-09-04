package doorForDog;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Digital Anvil on 19.08.2017.
 */
public class DogDoor {
    private boolean open;
    private ArrayList<Bark> allowedBarks;


    public DogDoor() {
        this.open = false;
        allowedBarks = new ArrayList<>();
    }

    public void open() {
        System.out.println("The dog door opens.");
        open = true;
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                close();
                timer.cancel();
            }
        }, 5000);

    }

    public void close() {
        System.out.println("The dog door closes.");
        open = false;
    }

    public boolean isOpen() {
        return open;
    }

    public ArrayList getAllowedBarks() {
        return allowedBarks;
    }

    public void addAllowedBark(Bark allowedBark) {
        allowedBarks.add(allowedBark);
    }
}
