public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        System.out.println(list);
        try{
            list.addFirst(5);
            list.addFirst(53);
            list.addFirst(4);
            list.addFirst(2);
            list.addLast(3);
            list.addLast(6);
//            list.removeFirst();
//            list.removeLast();
//            list.removeIndex(2);
            list.addIndex(5,9);
        }catch (NullPointerException e){
            System.out.println("RECOVERED: attempted to remove an item from an empty list");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("RECOVERED: attempted to remove an item from out of the list");
        }
        System.out.println(list);
    }
}
