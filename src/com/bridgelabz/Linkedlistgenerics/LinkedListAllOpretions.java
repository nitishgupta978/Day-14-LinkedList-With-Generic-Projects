package com.bridgelabz.Linkedlistgenerics;



public class LinkedListAllOpretions {
	Node head;
	private int size;
	LinkedListAllOpretions(){
		
		this.size=0;
	}


		class Node<T>{                 // line 6 to 15 create a single node null its fixed every linked list
			T data;
			Node nextRef;
			
			public Node(T data) {
				super();
				this.data = data;
				this.nextRef=null;
				size++;
			}
		}
		//add - first last node
		public <T> void addFirst(T data) {
			Node newNode = new Node( data);
			if(head == null) {
				head = newNode;
				return;
			}
			
			newNode.nextRef = head;
			head=newNode;
		}
		//last add
		
		public <T> void addLast(T data) {
			Node newNode = new Node(data);
			if(head == null) {
				head=newNode;
				return;
			}
			Node currentNode =head; // let take current node is first node (head)check the last yeh jab tak hoga jab tak null ke barabar na ho jaye 
			while (currentNode.nextRef !=null) {
				currentNode=currentNode.nextRef;
			}
			currentNode.nextRef=newNode;
		}
		
		// print
		public void printList() {
			if (head ==null) {
				System.out.println("this list is empty");
				return;
			}
			Node currentNode=head;
			while(currentNode!=null) { // if while(currentNode.nextRef!=null) use than last node not be show 
				System.out.print(currentNode.data+" -->");
				currentNode=currentNode.nextRef;
			}
			System.out.println(" Null");
		}
		
		 //delete first node
		public void deleteFirst() {
			if (head == null) {
				System.out.println("This is a Empty");
				return;
			}
			size--;
			head = head.nextRef;
		}
		private void deleteLast() {
			if (head == null) {
				System.out.println("This is empty");
				return;
			}
			size--;
			if(head.nextRef==null) {
				head=null;
				return;
			}
			Node secondNode = head;
			Node lastNode = head.nextRef;
			while(lastNode.nextRef!=null) {
				lastNode= lastNode.nextRef;
				secondNode=secondNode.nextRef;
			}
			secondNode.nextRef=null;
		}
		public int getSize() {
			return size;
		}
		
		public static void main(String[] args) {
			LinkedListAllOpretions list = new LinkedListAllOpretions();
			System.out.println("This condition for UC1,UC2,UC2,UC4");
			list.addFirst(56);
			list.addLast(30);
			list.addLast(70);//UC 1. UC2,UC3,UC4
			list.printList();
			
		System.out.println("This condition for UC5");	
			list.addFirst(70);
//			list.addLast(30);
//			list.addLast(56);
			//list.printList();
			
			list.deleteFirst();
			list.deleteLast();
			list.printList();
		System.out.println("This condition for UC6");	
			list.addLast(30);
			list.deleteLast();
			list.printList();
		System.out.println("This condition for UC8");
			list.addLast(40);
			list.addLast(70);
			list.printList();
			System.out.println("This condition for UC9");
			list.deleteLast();
			list.deleteLast();
			list.addLast(70);
			list.printList();
			
			System.out.println("size "+list.getSize());
			
			
			
			
		}
	}

