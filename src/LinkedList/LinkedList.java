package LinkedList;

public class LinkedList {
    Node head;
    Node tail;


    class Node{
        int value;
        Node next;

        public Node(int value){
            this.value=value;
        }
    }

    public LinkedList(int value){
        Node n1=new Node(value);
        head=n1;
        tail=n1;
    }

    public void getHead(){
        System.out.println("Head: "+head.value);
    }

    public void getTail(){
        System.out.println("Tail: "+tail.value);
    }

    public  void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }

    public void append(int value){
        Node n1=new Node(value);
        if(head==null){
            head=n1;
            tail=n1;
        }
        else{
            tail.next=n1;
            tail=n1;
        }
    }

    public void prepend(int value){
        Node n1=new Node(value);
        if(head==null){
            head=n1;
            tail=n1;
        }
        else{
            n1.next=head;
            head=n1;
        }
    }

    public Node removefirst(){
        Node temp=head;
        if(head==null){
            return null;
        }
        head=head.next;
        temp.next=null;
        return temp;
    }

    public Node removeLast(){
        Node temp=head;
        Node pre=head;
        while(temp.next!=null){
            pre=temp;
            temp=temp.next;
        }
        tail=pre;
        tail.next=null;
        return temp;
    }

    public void insert(int index,int value){
        Node n1=new Node(value);
        Node temp=head;
        if(index==0){
            prepend(value);
        }

        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }

        n1.next=temp.next;
        temp.next=n1;
    }

    public Node remove(int index){
        if(index==0){
            removefirst();
        }

        Node temp=head;
        Node prev=head;
        for(int i=0;i<index-1;i++){
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
        temp.next=null;

        return temp;

    }




}
