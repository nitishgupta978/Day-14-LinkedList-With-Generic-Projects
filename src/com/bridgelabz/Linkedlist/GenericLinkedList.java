package com.bridgelabz.Linkedlist;

class Node {
	int data ;
	Node nextRefOfNodes;
	//constructor create by command right click mouse & source than click on constructor  
	public Node(int data) {
		super();
		this.data = data;
		nextRefOfNodes=null;
	}
	
	 
	public static void main(String[] args) {
		Node node1 = new Node(56);
		Node node2 = new Node(30);
		Node node3 = new Node(70);
		
		node1.nextRefOfNodes= node2;
		
		GenericLinkedList(node1);
	}
public static void GenericLinkedList(Node head) {
	 Node temp = head ;
	 while(temp!=null) {
		 System.out.println(""+temp.data+" -->");
		 temp = temp.nextRefOfNodes;
	 }
	}
}


