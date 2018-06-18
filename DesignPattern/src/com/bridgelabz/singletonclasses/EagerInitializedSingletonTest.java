/**
 * 
 */
package com.bridgelabz.singletonclasses;

public class EagerInitializedSingletonTest {

	public static void main(String[] args)
	{
		System.out.println(EagerInitializedSingleton.getInstance().hashCode());
		System.out.println(EagerInitializedSingleton.getInstance().hashCode());
		System.out.println(EagerInitializedSingleton.getInstance().hashCode());

	}

}
