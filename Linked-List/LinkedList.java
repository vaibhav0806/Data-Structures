public class LinkedList{

    static class Node{
        Node next;
        int value;

        public Node(int value){
            this.value = value;
        }
    }

    Node first = null;

    public void addAtFront(Node node){
        node.next = first;
        first = node;
    }

    public void addAtEnd(Node node){
        if(first == null){
            first = node;
        }
        else{
            Node ptr = first;
            while(ptr.next != null){
                ptr = ptr.next;
            }
            ptr.next = node;
        }
    }

    public void removeFront(){
        first = first.next;
    }

    public void print(){
        Node ptr = first.next;
        System.out.print(first.value);
        while(ptr != null){
            System.out.print(" -> " + ptr.value);
            ptr = ptr.next;
        }
        System.out.println(" -> null");
    }

    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addAtEnd(new Node(5));
        list.addAtEnd(new Node(7));
        list.addAtFront(new Node(10));
        list.addAtEnd(new Node(2));
        list.print();
    }

}