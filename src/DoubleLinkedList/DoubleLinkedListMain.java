package DoubleLinkedList;

public class DoubleLinkedListMain {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.insertLinkedList(10, 0);
        list.insertLinkedList(20, 1);
        list.insertLinkedList(30, 2);
        list.traverseLinkedList();
        System.out.println(list.searchLinkedList(20));
        list.deleteLinkedList(1);
        list.traverseLinkedList();
    }
}
