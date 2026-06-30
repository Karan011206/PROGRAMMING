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

    
    public void insertAtPosition(int data, int position) {
        if (position < 0) {
            System.out.println("Invalid position!");
            return;
        }

     
        if (position == 0) {
            insertAtStart(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        
        for (int i = 0; i < position - 1; i++) {
            if (current == null) {
                System.out.println("Position out of bounds!");
                return;
            }
            current = current.next;
        }

        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
            System.out.println("Inserted " + data + " at position " + position + ".");
        } else {
            System.out.println("Position out of bounds!");
        }
    }


    public void deleteAtPosition(int position) {
        if (head == null || position < 0) {
            System.out.println("List is empty or invalid position!");
            return;
        }

       
        if (position == 0) {
            System.out.println("Deleted " + head.data + " from position 0.");
            head = head.next;
            return;
        }

        Node current = head;

     
        for (int i = 0; i < position - 1; i++) {
            if (current == null || current.next == null) {
                System.out.println("Position out of bounds!");
                return;
            }
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Position out of bounds!");
        } else {
            System.out.println("Deleted " + current.next.data + " from position " + position + ".");
            current.next = current.next.next; // Bypass the deleted node
        }
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

        list.insertAtStart(30);
        
        System.out.print("Initial Linked List: ");
        list.printList();

     
        list.insertAtPosition(35, 1);
        

        System.out.print("After Insertions: ");
        list.printList();


        list.deleteAtPosition(1);

      
        System.out.print("Final Linked List: ");
        list.printList();
    }
}
