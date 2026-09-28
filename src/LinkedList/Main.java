package LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList l1=new LinkedList(2);
        l1.append(3);
        l1.prepend(1);
        l1.insert(1,5);
        //System.out.println(l1.removeLast().value);
        //System.out.println(l1.removefirst().value);

        l1.printList();
        //l1.getHead();
        //l1.getTail();
    }
}