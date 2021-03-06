package com.foureyez.problem.linkedlist;

import com.foureyez.algorithm.linkedlist.Node;

public class FindMiddle {

	// Gives the middle of the linked list in O(n) time.
	public int findMiddle(Node head) {
		Node slowPointer = head;
		Node fastPointer = slowPointer;

		while (fastPointer != null && fastPointer.next != null) {
			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;
		}

		return slowPointer.data;
	}
}