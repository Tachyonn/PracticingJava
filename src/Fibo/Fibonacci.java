package Fibo;

/**
 * Created by Digital Anvil on 13.04.2017. Рекурсивный метод.
 */
public class Fibonacci {

    public long getNumber(int position) {
        if (position <= 0) return -1;
        if (position == 1) return 1L;
        if (position == 2) return 1L;
        return getNumber(position - 1) + getNumber(position - 2);
    }
}
