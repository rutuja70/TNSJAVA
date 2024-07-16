package is;

public class LLI {
Node head;
	class Node{
	String data;
	Node next;
		
		Node(String data){
			this.data=data;
			this.next=null;
		}
	}
	
	public void addFirst(String data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
		
	}
	
	public void atLoc(String data,int position) {
		Node newNode=new Node(data);
		if(position==0) {
			head=newNode;
			return;
		}
		
		Node current=head;
		int index=0;
		while(current!=null && index<position-1) {
			current=current.next;
			index++;
		}
		
		if(current==null) {
			System.out.print("out of bounds");
			return;
		}
		
		newNode.next=current.next;
		current.next=newNode;	
		return;
	}
	
	public void printList() {
	if(head==null) {	
		System.out.print("empty");
	}
	
	Node currNode=head;
	while(currNode!=null) {
		System.out.print(currNode.data+"->");
		currNode=currNode.next;
	}
	System.out.print("null");
	
	}
	
	public static void main(String args[]) {
		LLI list=new LLI();
		
		list.addFirst("this");
		list.atLoc("is",1);
		list.atLoc("list", 2);
		list.atLoc("a", 1);
		list.printList();
	}
}
