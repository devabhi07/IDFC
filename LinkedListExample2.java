package collections;

public class LinkedListExample2 {
//Linked list implementation in Java
// Creating a node
Node head;
static class Node {
 int value;
 Node next;
 Node(int d) {
   value = d;
   next = null;
 }
}
public static void main(String[] args) {
	LinkedListExample2 linkedList = new LinkedListExample2();
 // Assign value values
 linkedList.head = new Node(1);
 Node second = new Node(2);
 Node third = new Node(3);

 // Connect nodess
 linkedList.head.next = second;
 second.next = third;
 // printing node-value
 while (linkedList.head != null) {
   System.out.print(linkedList.head.value + " ");
   linkedList.head = linkedList.head.next;
 }
}
}