public class MyLinkedList <T>{
    private MyListNode<T> first;
    private MyListNode<T> last;
    private int size =0;
    public MyLinkedList(){
        first = null;
        last=null;
    }
    public void addLast(T data){
        MyListNode<T> temp = new MyListNode<>(data);
        if(first==null && last==null){
            first = temp;
            last = temp;
        }else{
            //point new node to last
            last.setNext(temp);
            last = temp;
        }
    }
    public void addFirst(T data){
        MyListNode<T> temp = new MyListNode<>(data);

        //edge case:empty list
        if(first==null && last==null){
            first = temp;
            last = temp;
        }else{
            //point new node to first
            temp.setNext(first);
            first = temp;
        }
        size ++;
    }
//    public T removeFirst(){
//
//    }
    public  int size(){
        return size;
    }

    public String toString(){
        MyListNode<T> current = first;
        String out = "";
        while(current != null){
            out += current.getData() + "->";
            current = current.getNext();
            System.out.println(out);
        }
        out += "null";
        return out;
    }

}
