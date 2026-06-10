package LinkedList;


public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void createSingleLinkedList(int nodeValue) {
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
    }

    //insert into a linked list
    public void insertLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;

        if (head == null) {
            createSingleLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    // Traversing through a linked list
    public void traverseLinkedList() {
        if (head == null) {
            System.out.println("Linked list does not exist");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {

                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;

            }
            System.out.println("\n");

        }
    }


    public boolean searchLinkedList(int value) {
        if (head == null) {
            return false;
        }
        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            if (tempNode.value == value) {
                return true;
            }
            tempNode = tempNode.next;
        }
        return false;
    }


    public void deleteLinkedList(int location) {
        if (head == null) {
            return;
        }
        if (location == 0) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
        } else if (location >= size - 1) {
            Node tempNode = head;
            for (int i = 0; i < size - 2; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = null;
            tail = tempNode;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
        }
        size--;
    }






}
