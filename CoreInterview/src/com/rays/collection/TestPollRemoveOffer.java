package com.rays.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestPollRemoveOffer {
	public static void main(String[] args) {

		Queue q1 = new PriorityQueue();
		q1.offer(3);
		q1.offer(4);
	    q1.offer(5);
		q1.offer(6);
		System.out.println(q1.poll());    // null
		System.out.println(q1);
		System.out.println(q1.remove());        //NoSuchElementException
		System.out.println(q1);

		// remove() method bhi queue se element ko remove karta hai,lekin agar queue
		// empty ho toh yeh NoSuchElementException throw karega.

	}

}
