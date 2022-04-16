package basics.concepts;

public interface MyInterface {
	//interfaces can have methods and variables 
	// they are abstract--> method signature no body
	// all the values in a interface are public,static and final by default
	int x = 10;
	// interface doesnt have any constructor- cant be instantiated.
//	It doesn’t have any constructor and couldn’t be instantiated.
//	The abstract method alone should be declared. 100% abstrcact (An abstract is 0-100 % abstracct)
//	Classes that implement the interface should provide the implementation for all the methods.
//	The interface contains only constants. 
	//java cannot have multiple inheritances hence we can use a interface to use multiple inheritance

	void displayResult();
	// on adding the above line the class that implements this interface, defaults to ad this method as well.
	//please check MyMainClass
}
