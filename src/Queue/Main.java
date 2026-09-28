package Queue;

public class Main {
    public static void main(String[] args) {
        Queue q1=new Queue(5);
        q1.enqueue(3);
        q1.enqueue(6);
        q1.enqueue(2);
        q1.dequeue();
        q1.print();
    }
}