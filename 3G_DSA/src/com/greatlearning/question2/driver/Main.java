package com.greatlearning.question2.driver;

import com.greatlearning.question2.service.Node;

class Main {

	Node prevNode = null;
	Node headNode = null;
	public void completeBSTtoSkewed(Node root) {

		if (root == null) {
			return;
		}

		completeBSTtoSkewed(root.left);
		
		Node rightNode = root.right;

		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}
		
		completeBSTtoSkewed(rightNode);
	}

	public void traverseRightSkewedTree(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		traverseRightSkewedTree(root.right);
	}

	public static void main(String[] args) {

		Main obj = new Main();
		Node node;
		
		node = new Node(50);
		node.left = new Node(30);
		node.right = new Node(60);
		node.left.left = new Node(10);
		node.right.left = new Node(55);

		obj.completeBSTtoSkewed(node);
		System.out.println("The resultant  output is :");
		obj.traverseRightSkewedTree(obj.headNode);
	}
}