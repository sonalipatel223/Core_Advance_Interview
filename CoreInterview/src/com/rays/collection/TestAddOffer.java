package com.rays.collection;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class TestAddOffer {
	public static void main(String[] args) {
		Queue q1 = new ArrayBlockingQueue(2);
		q1.offer(1);
		q1.offer(2);
		q1.offer(3);
		System.out.println(q1);
		// Jab aap offer(3) karte ho, toh queue full ho chuki hoti hai
		// (kyunki size 2 hai), isliye offer method false return karega.
		Queue q = new ArrayBlockingQueue(2);
		q.add(4);
		q.add(5);
		q.add(6);
//		q.add(7);
		System.out.println(q);
		// Agar aap add() use karte, toh IllegalStateException throw hota.
		// size full hone pr

		// We can use Iterator to iterate

//        Queue q1 = new PriorityQueue();
////        q1.offer(3);
////        q1.offer(4);
//        System.out.println(q1.poll());
	}

}
