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
    public String getStringelement(){return element;}
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
        return header.getNext().getStringelement();
    }
    public String last(){
        if(isEmpty()) return null;
        return trailer.getPrev().getStringelement();
    }
    public void addFirst(String e){
        addBetweenNode(e, header, header.getNext());
        
    }
    public void addLast(String e){
        addBetweenNode(e, header.getPrev(), trailer);
        
    }

    public Node<String> removeFirst(String e){
        if(isEmpty()) return null;
        return remove(header.getNext());        
    }

    public Node<String> removeLast(String e){
        if(isEmpty()) return null;
        return remove(trailer.getPrev());        
    }


    private Node<String> remove(Node<String> node) {
        Node<String> predecessor = node.getPrev();
        Node<String> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size --;
        return node.getStringlement();
    }
    private void addBetweenNode(String e, Node<String> predecessor, Node<String> successor) {
        Node<String> newest = new Node<>(e, predecessor, successor);
        predecessor.setNext(newest);
        successor.setPrev(newest);
        size++;

    }

}
