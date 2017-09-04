/**
 * Created by Digital Anvil on 02.04.2017.
 */
public class TestBSTree {
    public static void main(String[] args) {
        BSTree<Integer, String> testTree = new BSTree<>();

        System.out.println(testTree.size());

        testTree.add(1, "Node 1");
        testTree.add(2, "Node 2");
        testTree.add(3, "Node 3");
        testTree.add(10, "Node 10");
        testTree.add(18, "Node 18");
        testTree.add(24, "Node 24");
        testTree.add(15, "Node 15");
        testTree.add(11, "Node 11");
        testTree.add(8, "Node 8");

        System.out.println(testTree.size());

        testTree.remove(15);
        testTree.remove(11);
        testTree.remove(5);

        System.out.println(testTree.size());

        for (int i = 1; i <25 ; i++) {
            if(testTree.containsKey(i)){
                System.out.println(testTree.get(i));
            }
        }
    }
}
