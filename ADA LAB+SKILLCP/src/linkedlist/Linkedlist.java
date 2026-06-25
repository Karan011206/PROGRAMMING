package linkedlist;

class Node {
    int data;
    Node next;

    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}


public class Linkedlist {
    private Node head = null;

   
    public void insertAtStart(int data) {
        Node newNode = new Node(data);

        
        if (head == null) {
            head = newNode;
        } else {
            
            newNode.next = head;
           
            head = newNode;
        }
        System.out.println("Inserted " + data + " at the start.");
    }

    
    public void printList() {
        Node current = head;
        if (current == null) {
            System.out.println("The list is empty.");
            return;
        }
        
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.insertAtStart(40); 
        

       
        System.out.print("Final Linked List: ");
        list.printList();
    }
}
