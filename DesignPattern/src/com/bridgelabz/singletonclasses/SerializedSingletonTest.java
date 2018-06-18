/**
 * 
 */
package com.bridgelabz.singletonclasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializedSingletonTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException 
	{
		/*System.out.println(SerializedSingleton.getInstance().hashCode());
		System.out.println(SerializedSingleton.getInstance().hashCode());*/
		//SerializedSingleton  serializedSingleton=new SerializedSingleton();
		ObjectOutput out=new ObjectOutputStream(new FileOutputStream("/home/adminstrato/BijayaWorkSpace"
				+ "/DesignPattern/src/com/bridgelabz/singletonclasses/serializedsingletonobjects"));
		SerializedSingleton instanceOne=(SerializedSingleton)SerializedSingleton.getInstance();
		out.writeObject(instanceOne);
		out.close();
		ObjectInput in=new ObjectInputStream(new FileInputStream("/home/adminstrato/BijayaWorkSpace"
				+ "/DesignPattern/src/com/bridgelabz/singletonclasses/serializedsingletonobjects"));
		SerializedSingleton instanceTwo=(SerializedSingleton) in.readObject();
		in.close();
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());

	}

}
