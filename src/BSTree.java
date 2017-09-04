/**
 * Created by m.shevchenko on 31/3/2017.
 * https://pastebin.com/f50a4a9d7
 * https://habrahabr.ru/post/65617/
 */
public class BSTree<T1 extends Comparable<T1>, T2> {

    static class Node<T1, T2> {
        T1 key;
        T2 value;
        Node<T1, T2> left, right;

        Node(T1 key, T2 value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node<T1, T2> rootNode = null;
    private int treeSize = 0;

    public int size() {
        return treeSize;
    }

    public boolean containsKey(T1 key) {
        Node<T1, T2> currentNode = rootNode;
        while (currentNode != null) {
            int cmp = key.compareTo(currentNode.key);
            if (cmp == 0) {
                return true;
            }
            if (cmp < 0) {
                currentNode = currentNode.left;
            } else {
                currentNode = currentNode.right;
            }
        }
        return false;
    }

    public T2 get(T1 key) {
        Node<T1, T2> currentNode = rootNode;
        while (currentNode != null) {
            int cmp = key.compareTo(currentNode.key);
            if (cmp == 0) return currentNode.value;
            if (cmp < 0) {
                currentNode = currentNode.left;
            } else currentNode = currentNode.right;

        }
        return null;
    }

    public void add(T1 key, T2 value) {
        Node<T1, T2> currentNode = rootNode, tmpNode = null;
        while (currentNode != null) {
            int cmp = key.compareTo(currentNode.key);
            if (cmp == 0) {
                currentNode.value = value;
                return;
            } else {
                tmpNode = currentNode;
                if (cmp < 0) {
                    currentNode = currentNode.left;
                } else {
                    currentNode = currentNode.right;
                }
            }

        }
        Node<T1, T2> newNode = new Node<>(key, value);
        if (tmpNode == null) {
            rootNode = newNode;
        } else {
            if (key.compareTo(tmpNode.key) < 0) {
                tmpNode.left = newNode;
            } else {
                tmpNode.right = newNode;
            }
        }
        treeSize += 1;
    }

    public void remove(T1 key) {
        Node<T1, T2> currentNode = rootNode, tmpNode = null;
        while (currentNode != null) {
            int cmp = key.compareTo(currentNode.key);
            if (cmp == 0) {
                break;
            } else {
                tmpNode = currentNode;
                if (cmp < 0) {
                    currentNode = currentNode.left;
                } else {
                    currentNode = currentNode.right;
                }
            }
        }
        if (currentNode == null) {
            return;
        }
        if (currentNode.right == null) {
            if (tmpNode == null) {
                rootNode = currentNode.left;
            } else {
                if (currentNode == tmpNode.left) {
                    tmpNode.left = currentNode.left;
                } else {
                    tmpNode.left = currentNode.right;
                }
            }
        } else {
            Node<T1, T2> leftMost = currentNode.right;
            tmpNode = null;
            while (leftMost.left != null) {
                tmpNode = leftMost;
                leftMost = leftMost.left;
            }
            if (tmpNode != null) {
                tmpNode.left = leftMost.right;
            } else {
                tmpNode.right = leftMost.right;
            }
            currentNode.key = leftMost.key;
            currentNode.value = leftMost.value;
        }
        treeSize -= 1;
    }
}
