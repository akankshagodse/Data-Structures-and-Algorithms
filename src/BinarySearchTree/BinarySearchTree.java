package BinarySearchTree;

public class BinarySearchTree {
    Node root;
    class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value=value;
        }

    }

    public boolean insert(int value){
        Node n1=new Node(value);

        if(root==null){
            root=n1;
            return true;
        }

        Node temp=root;
        while(true){
            if(n1.value==temp.value){
                return false;
            }

            if(n1.value<temp.value){
                if(temp.left==null){
                    temp.left=n1;
                    return true;
                }
                temp=temp.left;
            }
            else{
                if(temp.right==null){
                    temp.right=n1;
                    return true;
                }
                temp=temp.right;
            }
        }

    }

    public boolean contains(int value){
        if(root==null){
            return false;
        }
        Node temp=root;

        while(temp!=null){
            if(value<temp.value){
                temp=temp.left;
            }
            else if(value>temp.value){
                temp=temp.right;
            }
            else{
                return true;
            }
        }
        return false;

    }
}
