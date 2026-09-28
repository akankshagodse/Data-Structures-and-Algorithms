package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList d1=new DoublyLinkedList(1);
        d1.append(5);
        d1.prepend(2);
        d1.getHead();
        d1.getTail();
        d1.getLength();
        d1.printList();
    }
}