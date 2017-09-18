package Collections;

import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class Blockingq {

	public static void main(String[] args) {
		practice1();

	}
	
	private static void practice1()
	{
		/**
		 * ArrayBlockingQueue is bounded by limit. Store elements in FIFO order.
		 */
		ArrayBlockingQueue queue = new ArrayBlockingQueue<>(100);
		queue.add(null);
		try
		{
		for(int idx = 0; idx <= 200; idx++)
		{
			queue.add(idx);
			
			System.out.println(idx);
//			System.out.println(queue.take());
		}
		}
		catch(Exception e) {e.printStackTrace();}
	}

	private static void practice2()
	{
		/**
		 * A variant of the "two lock queue" algorithm. Store elements in FIFO order.
		 */
		LinkedBlockingQueue queue = new LinkedBlockingQueue<>();
		
		try
		{
		for(int idx = 0; idx <= 200; idx++)
		{
			queue.put(idx);
			
			System.out.println(idx);
//			System.out.println(queue.take());
		}
		}
		catch(Exception e) {e.printStackTrace();}
	}
	
	private static void practice3()
	{
		/**
		 * Stores elemets that implemets either Comparator or Comparable. Order not maintain.
		 */
		PriorityBlockingQueue queue = new PriorityBlockingQueue();
		
		try
		{
		for(int idx = 99; idx >= 0; idx--)
		{
			queue.put(idx);
		
		}
		
		System.out.println(queue);
		}
		catch(Exception e) {e.printStackTrace();}
	}
	
	private static void practice4()
	{
		/**
		 * A thread that insert an element in queue is blocked until another thread take it. Contain only single element at a time.
		 */
		SynchronousQueue queue = new SynchronousQueue();
		
		try
		{
			queue.put(0);
			
			queue.take();
		}
		catch(Exception e) {e.printStackTrace();}
	}
}
