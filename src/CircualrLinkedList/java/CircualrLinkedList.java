public class CircularLinkedList<E> {
    private Node<E> tail;
    private int size;

    public CircularLinkedList() {
        tail=null;
        size=0;
    }
    public int size()
    public E getFirst(){
        return tail.getNext().getData();
    }
    public E getLast(){
        return tail.getData();
    }

    public int size()
    {
        return size;
    }