package Queue;

public class Queue {

    Node first;
    Node last;
    int length;
    class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }
    }

    Queue(int value){
        Node n1=new Node(value);
        first=n1;
        last=n1;
        length=1;
    }

    void print(){
        Node temp=first;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }

    void getFirst(){
        if(first == null){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("First: " + first.value);
        }
    }

    void getLast(){
        if(last == null){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Last: " + last.value);
        }
    }

    void getLength(){
        System.out.println("Length: " + length);
    }

    void  enqueue(int value){
        Node n1=new Node(value);
        if(length==0){
            first=n1;
            last=n1;
        }
        else{
            last.next=n1;
            last=n1;
        }
        length++;
    }

    Node dequeue(){

        if(length==0){
            return  null;
        }
        Node temp=first;
        if(length==1){
            first=null;
            last=null;
        }
        else{
            first=first.next;
            temp.next=null;
        }
        length--;
        return temp;
    }
}
