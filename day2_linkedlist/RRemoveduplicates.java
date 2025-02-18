package day2_linkedlist;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class RemoveDuplicates {

    static Node head = null;

    public static void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public static void display() {
        Node temp = head;
        
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void removeDuplicates() {
        if (head == null || head.next == null) {
            return;
        }

        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        Node current = head;

        while (current != null) {
            Node checker = current.next;
            boolean isDuplicate = false;

            while (checker != null) {
                if (checker.data == current.data) {
                    isDuplicate = true;
                    break;
                }
                checker = checker.next;
            }

            if (isDuplicate) {
                int duplicateValue = current.data;
                Node temp = dummy;
                while (temp.next != null) {
                    if (temp.next.data == duplicateValue) {
                        temp.next = temp.next.next;
                    } else {
                        temp = temp.next;
                    }
                }
            } else {
                prev = prev.next;
            }

            current = current.next;
        }

        head = dummy.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            add(k);
        }

        display();

        removeDuplicates();

        display();
        
        sc.close();
    }
}
