package is;

public class DLL {
Node head;
	class Node{
		String data;
		Node next;
		Node prev;
		
		
		Node (String data){
			this.data=data;
			this.next=null;
			this.prev=null;
					}
	}
	
	
	
	
	
	
	public void insertNode(String data) {
		Node newNode=new Node(data);
		newNode.prev=null;
		newNode.next=head;
		
		if(head!=null) {
			head.prev=newNode;
		}
		head=newNode;
	}
	
	
	public void addLast(String data) {
		Node newNode=new Node(data);
		newNode.next=null;
		Node currNode=head;
while(currNode.next!=null) {
			
			currNode=currNode.next;
		}
		if(head==null) {
			newNode=head;
			head.prev=null;
			
			return;
		}
		
		currNode.next=newNode;
		newNode.prev=currNode;		
	}
	
	
	public void deleteFirst() {
		if(head==null) {
			System.out.print("empty");
		}
		
		head=head.next;
		
		
	}
	
	public void deleteLast() {
		if(head==null) {
			System.out.print("empty");
		}
		
		Node currNode=head;
		Node lastNode=head.next;
		while(lastNode.next!=null) {
			currNode=currNode.next;
			lastNode=lastNode.next;
		}
		currNode.next=null;
	}
	
	
	public void display() {
		Node currNode=head;
		if(head==null) {
			System.out.println("null");	
		}
		
		while (currNode!=null) {
		
		System.out.print(currNode.data+"->");
		currNode=currNode.next;
		}
		System.out.print(" Null");
		
		
	}
	
	
	
	public static void main(String args[]) {
		DLL list=new DLL();
		list.insertNode("hi");
		list.insertNode("hello");
		list.insertNode("hey");
		list.addLast("rutu");
		list.deleteLast();
		list.display();
	}
	
}
