/**
 * 
 */
package com.bridgelabz.singletonclasses;

public class StaticBlockSingletonTest {

	public static void main(String[] args) 
	{
		System.out.println(StaticBlockSingleton.getInstance().hashCode());
		System.out.println(StaticBlockSingleton.getInstance().hashCode());
		System.out.println(StaticBlockSingleton.getInstance().hashCode());

	}

}
