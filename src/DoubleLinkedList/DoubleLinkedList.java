package DoubleLinkedList;

public class DoubleLinkedList {
    public DoubleNode head;
    public DoubleNode tail;
    public int size;


    public DoubleNode createSingleLinkedList(int nodeValue) {
        DoubleNode doubleNode = new DoubleNode();
        doubleNode.next = null;
        doubleNode.value = nodeValue;
        head = doubleNode;
        tail = doubleNode;
        size = 1;
        return head;
    }


    //insert into a linked list
    //1. if the link doesn't exist
    //2. inserting element at the begining
    //3. inserting element at the end
    //4. inserting anywhere else

    public void insertLinkedList (int nodeValue, int location) {
        DoubleNode doubleNode = new DoubleNode();
        doubleNode.value = nodeValue;

        if (head == null) {
            createSingleLinkedList(nodeValue);
            return;
        } else if (location == 0){
            doubleNode.next = head;
            doubleNode.previous = null;
            head.previous = doubleNode;
            head = doubleNode;
        } else if (location >= size) {
            doubleNode.next = null;
            doubleNode.previous = tail;
            tail.next = doubleNode;
            tail = doubleNode;
        } else {
            DoubleNode tempNode = head;
            int index = 0;
            while (index < location - 1){
                tempNode = tempNode.next;
                index++;
            }
            DoubleNode nextNode = tempNode.next;
            doubleNode.previous = tempNode;
            doubleNode.next = nextNode;
            tempNode.next = doubleNode;
            nextNode.previous = doubleNode;
        }
        size++;
    }


    // Traversing through a linked list
    public void traverseLinkedList (){
        if (head == null) {
            System.out.println("Linked list does not exist");
        } else {
            DoubleNode tempNode = head;
            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if (i != size -1){
                    System.out.print(" <-> ");
                }
                tempNode = tempNode.next;

            }
            System.out.println("\n");

        }
    }

    //Reverse Traverse

    public void reverseTraverseLinkedList (){
        if (head == null) {
            System.out.println("Linked list does not exist");
        } else {
            DoubleNode tempNode = tail;
            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if (i != size -1){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.previous;

            }
            System.out.println("\n");

        }
    }

    // search is here
    // also required revising due to a pathway error 

    public boolean searchLinkedList (int value) {
        if (head == null) {
            return false;
        }
        DoubleNode tempNode = head;
        for (int i = 0; i < size; i++) {
            if (tempNode.value == value) {
                return true;
            }
            tempNode = tempNode.next;
        }
        return false;
    }



    // here is the delete added for the task 
     // needed to move this over as the foolder was incorrect pathways 

    public void deleteLinkedList (int location) {
        if (head == null) {
            return;
        }
        if (location == 0) {
            head = head.next;
            if (head == null) {
                tail = null;
            } else {
                head.previous = null;
            }
        } else if (location >= size - 1) {
            tail = tail.previous;
            if (tail == null) {
                head = null;
            } else {
                tail.next = null;
            }
        } else {
            DoubleNode tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.previous = tempNode;
        }
        
    }

}
