// Define the Node class
class Node{
    int data;
    Node next;

    // Constructor to create a new Node
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

// Create class Linked list
public class LinkedList {
    Node head;

    // Method to add new node at the beginning
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    // Method to print the elements of linked list
    public void printList(){
        Node current = head;
        while(current != null){
            System.out.printf("%d ----> ",current.data);
            current = current.next;
        }
        System.out.println(current);
    }

    // Method to add new node at the middle
    public void addAtPosition(int data, int position) {
        Node newNode = new Node(data);
        Node current = head;
        if(position == 1){
            addFirst(data);
        }else{
            for (int i = 1; i < position-1; i++){
                if(current.next != null){
                    System.out.println("hi");
                    current = current.next;
                }else{
                    current.next = newNode;
                }
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Method to delete a node
    public void deleteAtPosition(int position) {
        Node current = head;
        if(position == 1){
            head = head.next;
        }else{
            for(int i = 1; i < position - 1; i++){
                if(current != null){
                    current = current.next;
                }
            }
            current.next = current.next.next;
        }

    }

    // Method to add new node at the ending
    public void addLast(int data){
        Node newNode = new Node(data);
        Node current = head;
        if(head == null){
            head = newNode;
        }else{
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Let's try
    public static void main(String[] args){

        // Initialize the linked list
        LinkedList linkedList = new LinkedList();

        // Initialize nodes
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3 );

        // Connect nodes
        linkedList.head = one;
        one.next = two;
        two.next = three;
        three.next = null;

        // Print the original list
        linkedList.printList();

        // Add the new node at the beginning manually
        linkedList.addFirst(0);

        // Print the updated list
        linkedList.printList();

        // Add the new node at the ending manually
        linkedList.addLast(4);

        // Print the updated list
        linkedList.printList();

        // Add the new node at the middle manually
        linkedList.addAtPosition(12, 2);

        // Print the updated list
        linkedList.printList();

        // Delete a node manually
        linkedList.deleteAtPosition(3);

        // Print the updated list
        linkedList.printList();

    }
}

