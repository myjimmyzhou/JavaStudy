import java.util.Arrays;
import java.util.EmptyStackException;

@SuppressWarnings("all")
public class JavaStack<E> {
    // 存放数据的物理结构
    private Object[] data;
    // 数组的默认长度
    private int length = 4;
    // 容器元素的个数
    private int size = 0;
    // 数组的下标
    private int index = -1;

    public boolean empty() {
        return size == 0;
    }

    public E pop() {
        if (size < 1)
            throw new EmptyStackException();
        size--;
        return (E) this.data[index--];
    }

    public E push(E item) {
        this.capacity();
        data[size++] = item;
//        size ++;
        index++;
        return item;
    }

    public void capacity() {
        if (data == null) {
            data = new Object[length];
        }
        if (size >= length) {
            length += (length >> 1);
            data = Arrays.copyOf(data, length);
        }
    }

    public static void main(String[] args) {
        JavaStack<String> myStack = new JavaStack<>();
        myStack.push("a");
        myStack.push("b");
        myStack.push("c");
        myStack.push("d");
        myStack.push("e");
        myStack.push("f");
        System.out.println(myStack.size);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}
