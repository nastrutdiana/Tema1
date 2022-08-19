package exercitii;

public class List {

    private Node start;

    private class Node{
        private int val;
        private Node next;
        public Node() {
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node(int val) {
            this.val = val;
        }
    }

    public List(int val) {
        this.start = new Node(val);
    }
    public void printList(){
        Node node = start;
        while (node.next!=null){
            System.out.println(node.getVal() + " ");
            node = node.next;
        }
        System.out.println(node);
    }
    public void add(int val){
        Node node = start;
        while (node.next != null){
            node = node.next;
        }
        Node aux = new Node(val);
        node.next = aux;
    }

    public int size(){
        Node node = start;
        int size = 0;
        while (node.next!=null){
            size++;
            node = node.next;
        }
        size++;
        return size;
    }

    public void addAtPosition(int val, int position){
        Node node = start;
        int size = 0;
        while (node.next!=null){
            if (size == position)
                break;
            node = node.next;
            size++;
        }
        Node aux = new Node(val);
        Node next = node.next;
        node.next = aux;
        aux.next = next;
    }

    public void inspectPosition(int position){
        Node node = start;
        int size = 0;
        while (node.next!=null){
            if (size== position)
                break;
            node = node.next;
            size++;
        }
        System.out.println(node.val);
    }

    public void setAtPosition(int val, int position){
        Node node = start;
        int size = 0;
        while (node. next != null){
            if(size == position)
                break;
            node = node.next;
            size++;

        }
        node.setVal(val);
    }

    public void removePosition(int pos){
        Node node = start;
        int size = 0;
    }


}
