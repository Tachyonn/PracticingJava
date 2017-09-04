package Fibo;

/**
 * Created by root on 13.04.2017.
 */
public class FibonacciTest {
    public static void main(String[] args) {
        Fibonacci fibo = new Fibonacci();
        for (int i = 0; i < 10; i++) {
            System.out.println(fibo.getNumber(i));
        }

    }
}
