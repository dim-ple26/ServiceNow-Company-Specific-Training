package day2_linkedlist;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LLbasic {

    static Node head =  null;
    public static void addNewElement(int newdata){
        Node newNode = new Node(newdata);
        if(head==null){
            head = newNode;
            return;
        }

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }



    public static void addNewElementAtFirst(int newdata){


        Node newNode = new Node(newdata);



        newNode.next=head;
        head=newNode;
    }


    public static void addatposition(int pos, int newdata){

        pos-=2;
        if(pos<0){
            addNewElementAtFirst(newdata);
            return;
            
        }
        Node temp=head;


        while(pos>0){
            pos--;
            temp=temp.next;
        }
        Node newNode=new Node(newdata);
        newNode.next=temp.next;
        temp.next=newNode;

    }

    public static void display(){
        while(head!=null){
            System.out.print(head.data+ "->");
            head=head.next;

        }


    }



    public static void main(String[] args) {

        addNewElementAtFirst(10);
        addNewElement(20);
        addNewElementAtFirst(90);
        display();

        addNewElement(80);
        display();

        addatposition(3,500);
        display();

        

        




    }
    
}
