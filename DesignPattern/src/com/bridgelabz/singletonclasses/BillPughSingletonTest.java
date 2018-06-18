/**
 * 
 */
package com.bridgelabz.singletonclasses;

public class BillPughSingletonTest {

	public static void main(String[] args)
	{
		System.out.println(BillPughSingleton.getInstance().hashCode());
		System.out.println(BillPughSingleton.getInstance().hashCode());

	}

}
