package Stack;

public class Stack {
    int height;
    Node top;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }
    }

    Stack(int value){
        Node n1=new Node(value);
        top=n1;
        height=1;
    }

    void printStack(){
        Node temp=top;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }

    void push(int value){
        Node n1=new Node(value);
        if(top==null){
            top=n1;
        }
        else{
            n1.next=top;
            top=n1;
        }
        height++;
    }

    Node pop(){
        Node temp=top;
        if(top==null){
            return null;
        }
        else{
            top=top.next;
            temp.next=null;
        }
        height--;
        return temp;
    }

    void peek(){
        if(top == null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Top: " + top.value);
        }
    }
}
