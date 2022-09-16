public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        System.out.println(list);

        list.addFirst(5);
        list.addFirst(53);
        list.addFirst(4);
        list.addFirst(2);
        list.addLast(3);
        list.addLast(6);
        System.out.println(list);
    }
}
