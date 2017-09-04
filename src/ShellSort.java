/**
 * Created by root on 30.03.2017.
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        int d = length / 2;
        while (d > 0) {
            for (int i = 0; i < length - d; i++) {
                int j = i;
                while ((j >=0) && (array[j] > array[j + d])) {
                    int tmp = array[j];
                    array[j] = array[j + d];
                    array[j + d] = tmp;
                    j--;
                }
            }
            d /= 2;
        }

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
