package test1;

import java.util.ArrayList;
import java.util.Comparator;

public class LinkedList {

	private Node head;
	private ArrayList<Node> l;

	public LinkedList(Node head) {
		this.l = new ArrayList<Node>();
		this.head = head;
		l.add(head);

	}

	public void insert(Node n) {

		if (head == null) {

			head = n;
			l.add(n);

		} else {

			Node lastNode = l.get(l.size() - 1);
			lastNode.setNext(n);
			l.add(n);

		}
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Node> sortLinkedList(ArrayList<Node> ll) {
		@SuppressWarnings("unchecked")
		ArrayList<Node> ll1 = (ArrayList<Node>) ll.clone();
		ll1.sort(Comparator.comparing(Node::getValue));
		return ll1;
	}

	public void printLinkedList() {
		ArrayList<Node> ll1 = sortLinkedList(l);

		for (int i = 0; i < ll1.size(); i++) {
			System.out.println("the node value is : " + ll1.get(i).getValue());
		}

	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public ArrayList<Node> getL() {
		return l;
	}

	public void setL(ArrayList<Node> l) {
		this.l = l;
	}

	

}
