package PractiseJavaDataStructure;

public class DoublyLinkedList {
    private static class Node<String>{
        private String element;
        private Node<String> prev;
        private Node<String> next;
        public Node(String e, Node <String> p, Node<String> n ){
            element = e;
            prev = p;
            next = n;
        }
    public String getStringlement(){return element;}
    public Node<String> getPrev(){return prev;}
    public Node<String> getNext(){return next;}
    public void setPrev(Node<String> p) {prev = p;}
    public void setNext(Node<String> n) {prev = n;}

    }

    // creating the instance variables of the DoublyLinkedList
    private Node<String> header;
    private Node<String> trailer;
    private int size = 0;
    /** constructs or initialise a new empty list */

    public DoublyLinkedList(){
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
    }
    public int size(){return size;}
    public boolean isEmpty(){return size ==0;}
    public String first(){
        if(isEmpty()) return null;
        return header.getNext().getStringlement();
    }
    public String last(){
        if(isEmpty()) return null;
        return trailer.getPrev().getStringlement();
    }
    public void addFirst(String e){
        addBetweenNode(e, header, header.getNext());
        
    }
    public void addLast(String e){
        addBetweenNode(e, header.getPrev(), trailer);
        
    }

    public Node<String> removeFirst(String e){
        if(isEmpty()) return null;
        addBetweenNode(e, header., next);
        return header;

        
    }


    private void addBetweenNode(java.lang.String e, Node<java.lang.String> header2, Node<java.lang.String> next) {
    }

}
