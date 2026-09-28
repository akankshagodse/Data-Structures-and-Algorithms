package DoublyLinkedList;

public class DoublyLinkedList {
    Node head;
    Node tail;
    int length;
    class Node{
        int value;
        Node prev;
        Node next;
        public Node(int value){
            this.value=value;
        }
    }

    public  DoublyLinkedList(int value){
        Node n1=new Node(value);
        head=n1;
        tail=n1;
        length=1;
    }

    public void getHead(){
        System.out.println("Head: "+head.value);
    }

    public void getTail(){
        System.out.println("Tail: "+tail.value);
    }

    public void getLength(){
        System.out.println("Length: "+length);
    }

    void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }

    public void  append(int value){
        Node n1=new Node(value);
        if(length==0){
            head=n1;
            tail=n1;
        }
        else{
            tail.next=n1;
            n1.prev=tail;
            tail=n1;
        }
        length++;
    }

    Node removeLast(){
        if(length==0){
            return null;
        }
        Node temp=tail;
        tail=tail.prev;
        tail.next=null;
        temp.prev=null;
        length--;
        if(length==0){
            head=null;
            tail=null;
        }
        return temp;

    }

    public void prepend(int value){
        Node n1=new Node(value);
        if(length==0){
            head=n1;
            tail=n1;
        }
        else{
            n1.next=head;
            head.prev=n1;
            head=n1;
        }
        length++;
    }


    Node removeFirst(){
        Node temp=head;
        if(length==0){
            return null;
        }
        if(length==1){
            head=null;
            tail=null;
        }
        else{
            head=head.next;
            head.prev=null;
            temp.next=null;

        }
        length--;
        return temp;

    }

    public boolean insert(int index,int value){
        if(index<0||index >length){
            return false;
        }
        if(index==0){
            prepend(value);
            return true;
        }
        if(index==length){
            append(value);
            return true;
        }
        Node n1=new Node(value);
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        n1.next=temp.next;
        n1.prev=temp;
        temp.next.prev=n1;
        temp.next=n1;
        length++;
        return true;
    }

    Node remove(int index){
        Node temp=head;
        if(index<0||index>=length){
            return null;
        }
        if(index==0){
            return removeFirst();
        }
        if(index==length-1){
            return  removeLast();
        }

        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
        temp.next=null;
        temp.prev=null;
        length--;
        return temp;

    }



}
