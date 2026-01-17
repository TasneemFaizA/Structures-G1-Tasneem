
package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> dlist=new DoublyLinkedList<Integer>();
        dlist.addFirst(3);
        dlist.addFirst(4);
        dlist.addLast(6);
        dlist.addLast(7);
        dlist.addLast(5);
        dlist.removeLast();
        dlist.removeFirst();
        dlist.display();
    }
}
