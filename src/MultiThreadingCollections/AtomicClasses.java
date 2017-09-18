package MultiThreadingCollections;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;

public class AtomicClasses {

	/**
	 * Atomic Wrapper clases ensure read data. increment data. store data in one phase.
	 * @param args
	 */
	public static void main(String[] args) {
		practice3();

	}
	
	public static void practice1()
	{
		AtomicBoolean atomicBoolean = new AtomicBoolean();
		boolean prev = atomicBoolean.getAndSet(false);
		atomicBoolean.get();
		atomicBoolean.set(false);
		boolean jj = atomicBoolean.compareAndSet(true, false);
		System.out.println(prev + "---" + atomicBoolean.get() + "---" + jj);
	}

	public static void practice2()
	{
		AtomicInteger atomicInteger = new AtomicInteger();
		System.out.println(atomicInteger.get());;
		atomicInteger.set(3);
		System.out.println(atomicInteger.getAndSet(4));
		System.out.println(atomicInteger.compareAndSet(7, 6));
		System.out.println(atomicInteger.getAndAdd(4));
		System.out.println(atomicInteger.addAndGet(5));
		System.out.println(atomicInteger.getAndIncrement());
		System.out.println(atomicInteger.incrementAndGet());
		
		
		
	}

	public static void practice3()
	{
		String g = new String("Hi MAnisha Singh");
		AtomicReference<String> st = new AtomicReference<>(g);
		String gg = new String("Hi MAnisha Singh");
		System.out.println(st.compareAndSet(gg, "pp"));
	}
}
