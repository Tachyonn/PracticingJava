package linked.list;

/**
 * Created by root on 12.04.2017.
 */
public class LinkedList {

    private Node rootNode;
    private int listSize;

    public LinkedList() {
        this.rootNode = new Node();
        this.listSize = 0;
    }

    public void add(Integer data) {
        Node currentNode = rootNode;

        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        currentNode.setData(data);
        currentNode.setNext(new Node());
        listSize++;
    }

    public Integer get(int index) {
        if (index >= listSize) return null;
        Node currentNode = rootNode;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode.getData();
    }

    public boolean delete(int index) {
        if (index >= listSize || index < 0) return false;
        if (index == 0) {
            rootNode = rootNode.getNext();
            listSize--;
            return true;
        }
        Node currentNode = rootNode;
        Node tmpNode = null;
        for (int i = 0; i < index; i++) {
            if (i == index - 1) {
                tmpNode = currentNode;
            }
            currentNode = currentNode.getNext();

        }
        tmpNode.setNext(currentNode.getNext());
        listSize--;
        return true;
    }

    public int size() {
        return listSize;
    }

}
