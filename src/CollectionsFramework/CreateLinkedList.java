package CollectionsFramework;


//single lnked list 

		// head--> |_|_|   |_|_|     |_|_|--null(tail)
		//           n1      n2        n3

public class  CreateLinkedList {
	
	Node head;
	
	
	
	class Node{
		
		int data;
		
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
		
	
	}
	
	public void printMyLL() {
		Node n = head;
		while(n!=null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	public static void main(String[] args) {
		
		CreateLinkedList ll = new CreateLinkedList();
		
		//to create a node
		Node n1 = ll.new Node(13);
		ll.head = n1;
		
		Node n2 = ll.new Node(15);
		n1.next = n2;
		
		
		Node n3 = ll.new Node(17);
		n2.next =n3;
		

		
		
		ll.printMyLL();
		
		

	}

}
