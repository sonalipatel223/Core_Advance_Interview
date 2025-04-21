package com.rays.collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {
	public static void main(String[] args) {

		Queue queue = new PriorityQueue();
		// Queue queue1 = new LinkedList();

		queue.offer(100);
		queue.offer(200);
		queue.offer(300);
		queue.add(400);

		System.out.println(queue.add(500));
		System.out.println(queue);
		System.out.println( queue.element());
		System.out.println(queue.peek());//provide first
		System.out.println(queue.poll());// provide first and remove it
		System.out.println(queue.remove());// provide first and remove it
		System.out.println(queue);
		System.out.println( queue.remove(200));
		System.out.println(queue);
		System.out.println(queue.offer(600));
		System.out.println(queue);

	}

}
