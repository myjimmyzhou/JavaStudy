@SuppressWarnings("all")
public class JavaBinaryTree<E extends Integer> {
    private Node<E> root;

    public void add(E item) {
        Node<E> node = new Node<E>(item);
        if (root == null) {
            root = node;
        } else {
            root.addNode(node);
        }
    }

    public void sort() {
        if (root == null) return;
        root.inorderTraversal();
    }

    public static void main(String[] args) {
        JavaBinaryTree<Integer> sort = new JavaBinaryTree<>();
        // 1,8,6,3,5,2
        sort.add(1);
        sort.add(8);
        sort.add(6);
        sort.add(3);
        sort.add(5);
        sort.add(2);
        sort.sort();
    }

    class Node<E extends Integer> {
        private E item;
        private Node leftItem;
        private Node rightItem;

        public Node(E item) {
            this.item = item;
        }

        public void addNode(Node<E> node) {
            if (node.item.intValue() < item.intValue()) {
                if (leftItem == null)
                    leftItem = node;
                else
                    leftItem.addNode(node);
            } else {
                if (rightItem == null)
                    rightItem = node;
                else
                    rightItem.addNode(node);
            }
        }

        // 中序遍历
        public void inorderTraversal() {
            if (leftItem != null)
                leftItem.inorderTraversal();
            System.out.println(item);
            if (rightItem != null)
                rightItem.inorderTraversal();
        }
    }


}
