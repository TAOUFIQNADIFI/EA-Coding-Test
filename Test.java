package test1;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n = new Node(0);
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		LinkedList l = new LinkedList(n);

		l.insert(n2);
		l.insert(n4);
		l.insert(n6);
		l.insert(n1);
		l.insert(n3);
		l.insert(n5);
		ArrayList<Node> al = l.getL();

		for (int i = 0; i < al.size() - 1; i++) {

			System.out.println("Node value is: " + al.get(i).getValue() + " . nextNode value is: "
					+ al.get(i).getNext().getValue());
		}
		System.out.println("the last Node value is: " + al.get(al.size() - 1).getValue());

		l.printLinkedList();

	}

}
