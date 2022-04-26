package linkedlist;

public class SinglyLinkedList {
    private Node head;

    public void insertNode(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        Node temp = head;  // head will be always at first location so will iterate using temp
        if (head == null) {   // if head is null then  list in empty  inserting node will be first node
            head = newNode;

        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;

        }
    }

    public void insertAfterNode(int location, int data) {
        Node temp = head;
        Node newNode = new Node();
        newNode.data = data;
        while (location-- > 1) {
            temp = temp.next;
            if (temp == null) {
                System.out.println("unable to insert on this location");
                return;
            }
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void deleteAtBegining() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    public void deleteAtEnd() {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteNodeAfter(int location) {
        Node temp = head;
        while (location-- > 1) {
            temp = temp.next;
            if (temp == null) {
                System.out.println("unable to insert on this location");
                return;
            }
        }
        temp.next = temp.next.next;

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.insertNode(10);
        linkedList.insertNode(12);
        linkedList.insertNode(13);
        linkedList.insertNode(15);
        linkedList.insertAfterNode(2, 11);
        linkedList.deleteAtBegining();
        linkedList.deleteAtEnd();
        linkedList.deleteNodeAfter(2);
        linkedList.display();

    }
}
