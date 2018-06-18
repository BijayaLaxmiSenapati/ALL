/**
 * 
 */
package com.bridgelabz.singletonclasses;

public class EagerInitializedSingleton 
{
	  
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
    private EagerInitializedSingleton()
    {
    	
    }

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}
