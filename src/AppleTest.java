/**
 * Created by Digital Anvil on 10.04.2017.
 */
public class AppleTest {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        if(apple1.compareTo(apple2)==0) System.out.println("Equals");
        else System.out.println("Not equals");
    }
}
