package PractiseJavaDataStructure;

public class SinglyLinkedList<E> {

    // A Nested Node class
    private static class Node<E>{
        private E item;
        private Node<E> next;
        public Node(E i, Node<E> n){
            item = i;
            next = n;
        }
        public E getItem(){return item;}
        public Node<E> getNext(){return next;}
        public void setNext(Node <E> n){next = n;}
    }
    //instances of the variables
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;
    public SinglyLinkedList(){}
    public int size(){return size;}
    public boolean isEmpty(){return size == 0;}
    public E firstItem(){
        if(isEmpty()) return null;
        return head.getItem();
    }
    public E last(){
        if(isEmpty()) return null;
        return tail.getItem();

    }
    // update methods by adding contents
    public void addLast(E i){
        Node<E> newest = new Node<>(i , null);
        if(isEmpty())
            head = newest;
        else
            tail.setNext(newest);
        tail = newest;         
        size++;
    }
    //
    public E removeFirst(){
        if(isEmpty()) return null;
        E answer = head.getItem();
        head = head.getNext();
        size--;
        if(size == 0)
            tail = null;
        return answer;
    }


}