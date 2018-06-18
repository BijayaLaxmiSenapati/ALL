/**
 * 
 */
package com.bridgelabz.singletonclasses;

public enum EnumSingleton 
{

    INSTANCE,INSTANCE2;
    
    public static void doSomething()
    {
       System.out.println(INSTANCE.hashCode());
       System.out.println(INSTANCE2.hashCode());

    }
    public static void main(String[] args)
    {
    	doSomething();
    	doSomething();

    }
}
