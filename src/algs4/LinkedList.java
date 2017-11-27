package algs4;

public class LinkedList {


    private Node head;
    private int size;

    class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public LinkedList(){
        head = null;
        size = 0;
    }

    public int size(){
        return this.size;
    }

    public void append(int value) {
        //return head;
        Node newNode = new Node(value);
        if (head == null){
            head = newNode;
            size++;
        }else{
            Node currNode = head;
            while(currNode.next != null){
                currNode = currNode.next;
            }

            currNode.next = newNode;
            size++;
        }
    }

    public boolean insertbyIndex(int index, int value){
        Node newNode = new Node(value);
        if(index < 0 || index > size){
            return false;
        }
        if(index == 0){
            newNode.next = head;
            head = newNode;
            size++;
            return true;
        }else{
            int count = 1;
            Node curNode = head.next;
            while(curNode != null){
                if (count == index - 1 ){
                    //curNode.next = newNode;
                    newNode.next = curNode.next;
                    curNode.next = newNode;
                    size++;
                    return true;
                }
                count++;
                curNode = curNode.next;
            }
        }
        return false;
    }

    public boolean deletebyIndex(int index) {
        if (index < 0 || index > size - 1) {
            return false;
        }
        if (index == 0) {
            head = head.next;
            size--;
            return true;
        }
        int i = 1;
        Node preNode = head;
        Node curNode = preNode.next;
        while (curNode != null) {
            if (i == index) {
                preNode.next = curNode.next;
                size--;
                return true;
            }
            preNode = curNode;
            curNode = curNode.next;
            i++;
        }
        //size--;
        return false;
    }

    public boolean deletebyValue(int value) {
        if (head.val == value){
            head = head.next;
            size--;
            return true;
        }
        Node preNode = head;
        Node currNode = preNode.next;
        while (currNode.val != value) {
            preNode = currNode;
            currNode = currNode.next;
        }
        preNode.next = currNode.next;
        size--;
        return true;
    }

    public void reverseList(){

    }

    public void printList() {
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.val);
            System.out.print( " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.append(5);
        list.append(3);
        list.append(1);
        list.append(2);
        list.append(55);
        list.append(36);
        //list.printList();
        System.out.println("linkSize: " + list.size());
        //System.out.println("head.data:" + list.head.val);
        list.printList();

        list.deletebyValue(5);
        System.out.println("After deletebyValue(5):");
        System.out.println("linkSize: " + list.size());
        list.printList();
        System.out.println();

        list.deletebyIndex(3);
        System.out.println("After deletebyIndex(3):");
        System.out.println("linkSize: " + list.size());
        list.printList();
        System.out.println();

        list.insertbyIndex(4,9);
        System.out.println("After insertbyIndex(4,9):");
        System.out.println("linkSize: " + list.size());
        list.printList();
        System.out.println();

        list.append(4);
        System.out.println("After Insert(4):");
        System.out.println("linkSize: " + list.size());
        list.printList();
        System.out.println();
    }
}

