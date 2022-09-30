package collections;

public class LinkedListExample {
	Node head;
	class Node{
		String data;
		Node next;
		Node(String Data){
			this.data=data;
			this.next=null;
		}
	}	
//add first
	public void addFirst(String data) {
		Node newNode =new Node(data);
		if(head == null) {
			head=newNode;
			return;	
		}
		newNode.next=head;
		head=newNode;
	}
	//add last
	public void addLast(String data) {
		Node newNode =new Node(data);
		if(head == null) {
			head =newNode;
			return;
		}
		Node currNode=head;
		while(currNode.next != null) {
			currNode=currNode.next;	
		}
		currNode.next=newNode;
	}
	//print
	public void printList() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		Node currNode=head;
		while(currNode != null) {
			System.out.print(currNode.data+" ->");
			currNode=currNode.next;
		}
		System.out.println("Null");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListExample list=new LinkedListExample();
		list.addFirst("Hello");
		list.addFirst("java");
		list.printList();
		list.addLast("and");
	}
}
