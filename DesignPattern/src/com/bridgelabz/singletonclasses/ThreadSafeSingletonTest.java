/**
 * 
 */
package com.bridgelabz.singletonclasses;

public class ThreadSafeSingletonTest
{

	public static void main(String[] args)
	{
		System.out.println(ThreadSafeSingleton.getInstance().hashCode());
		System.out.println(ThreadSafeSingleton.getInstance().hashCode());
		
		System.out.println(ThreadSafeSingleton.getInstanceUsingDoubleLocking().hashCode());
		System.out.println(ThreadSafeSingleton.getInstanceUsingDoubleLocking().hashCode());

	}

}
