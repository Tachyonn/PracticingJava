package linked.list;

import linked.list.LinkedList;

/**
 * Created by root on 12.04.2017.
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList testList = new LinkedList();
        for (int i = 0; i <100 ; i++) {
            testList.add(i);
        }
        testList.delete(-5);
        System.out.println(testList.get(5));
    }
}
