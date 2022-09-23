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
        size++;
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
    public T removeFirst(){
        if(first ==null){
            throw new NullPointerException("MyLinkedList is empty");
        }
        MyListNode<T> temp = first;
        first = first.getNext();
        temp.setNext(null);
        return null;
    }
    public T removeIndex(int n){
        MyListNode<T>  IndexNum= first;
        MyListNode<T> prevNumOnIndex = IndexNum;
        int count = 0;
        if(n ==0){
            removeFirst();
            return null;
        }
//        try{
//            while(count != n){
//                prevNumOnIndex = IndexNum;
//                IndexNum = prevNumOnIndex.getNext();
//                count++;
//            }
//        }catch (ArrayIndexOutOfBoundsException e){
//            throw new ArrayIndexOutOfBoundsException("Index out of bound");
//        }
        while(count != n){
            prevNumOnIndex = IndexNum;
            IndexNum = prevNumOnIndex.getNext();
            count++;
        }
        prevNumOnIndex.setNext(IndexNum.getNext());
        IndexNum.setNext(null);
        return null;
    }
    public T addIndex(int n,T data){
        MyListNode<T>  IndexNum= first;
        MyListNode<T> prevNumOnIndex = IndexNum;
        MyListNode<T> temp = new MyListNode<>(data);
        int count = 0;
        while(count != n){
            prevNumOnIndex = IndexNum;
            IndexNum = prevNumOnIndex.getNext();
            count++;
        }
        prevNumOnIndex.setNext(temp);
        temp.setNext(IndexNum);
        return null;
    }
    public T removeLast(){
        if(first ==null){
            throw new NullPointerException("MyLinkedList is empty");
        }
        if(first == last){
            first = null;
            last = null;
        }
        MyListNode<T> previous = first;
        while(previous.getNext() != last){
            previous=previous.getNext();
        }
        last = previous;
        last.setNext(null);
        return null;
    }
    public  int size(){
        return size;
    }

    public String toString(){
        MyListNode<T> current = first;
        String out = "";
        while(current != null){
            out += current.getData() + "->";
            current = current.getNext();
        }
        out += "null";
        return out;
    }

}
