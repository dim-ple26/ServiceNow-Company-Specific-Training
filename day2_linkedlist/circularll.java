package day2_linkedlist;
import java.util.Scanner;


class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}


public class circularll {
    static Node head = null;
    public static void add(int data){

        Node newnode = new Node(data);


        if(head==null){
            head = newnode;

            return;
        }
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.next=head;

    }

    public static void display(){
        Node temp=head;
        while(temp!=head){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print(temp.data);
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);


    }


    
}
