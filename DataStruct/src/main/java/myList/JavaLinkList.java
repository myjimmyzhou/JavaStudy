package myList;

@SuppressWarnings("all")
public class JavaLinkList<E> {
    private Node<E> head;
    private int size;

    public void add(E item) {
        Node<E> node = new Node<E>(item, null, null);
        Node<E> tail = getTail();
        if (tail == null) {
            this.head = node;
        } else {

            node.pre = tail;
            tail.next = node;
        }
        size++;
    }

    public E get(int index) {
        checkIndex(index);
        Node<E> node = getNode(index);
        return node.item;
    }

    public int size() {
        return size;
    }

    public E remove(int index) {
        checkIndex(index);
        Node<E> node = getNode(index);
        if (node.pre == null) {
            node.next.pre = null;
            head = node.next;
        } else if (node.next == null) {
            node.pre.next = null;
        } else {
            node.pre = node.next;
            node.next.pre = node.pre;
        }
        size--;
        return node.item;
    }

    public Node<E> getNode(int index) {
        Node<E> node = this.head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Index:" + index + "Size:" + size);
    }

    private Node getTail() {
        if (head == null) return null;
        Node<E> node = head;
        while (true) {
            if (node.next == null)
                break;
            node = node.next;
        }
        return node;
    }

    class Node<E> {
        private E item;
        private Node next;
        private Node pre;

        public Node(E item, Node pre, Node next) {
            this.item = item;
            pre = pre;
            next = next;
        }
    }

    public static void main(String[] args) {
        JavaLinkList<String> list = new JavaLinkList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        System.out.println("size:" + list.size());
        System.out.println(list.get(3));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
