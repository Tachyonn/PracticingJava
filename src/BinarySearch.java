/**
 * Created by root on 30.03.2017.
 */
public class BinarySearch {
    public static void main(String[] args) {

        int data[] = {3, 6, 7, 10, 34, 56, 60};
        int numberToFind = 5;
        boolean flag = false;

        for (int i = 0; i < data.length; i++) {
            if (data[i] == numberToFind) {
                System.out.println(i);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(-1);
        }
    }
}