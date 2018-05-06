/**
 * In this version I'll experiment with:
 * 
 * imports access modifiers abstract classes and -methods final classes final
 * methods and final fields
 * 
 * 
 * @author Dirk
 *
 */


package programStart;
/*
 * package someOtherPackage;  < --  won't work!
 * 									max 1 package per class
 */

/* 
 * someOtherPackage.SomeOtherclass import < -- won't work!
 * 												bad syntax
 * 												proper syntax: import <package>.<class>;
 */
import mySecondPackage.ImportMe;



public class ProgramStart extends ImportMe {

	public static void main(String[] args) {

		ImportMe IM = new ImportMe();
		/*
		 * IM.myFirstDefaultMethod(); <-- won't work. The method has default access.
		 * ProgramStart and ImportMe are not in the same package!
		 */

		/*
		 * IM.myFirstInt; < -- won't work. You can't call a private field like this.
		 * 
		 */

		System.out.println("This IM. It's my first object! " + IM.myFirstMethod()); // note: myFirstMethod is coveriant
																					// with System.out.printline. They
																					// both output a String.
		System.out.println();
		System.out.println("This IM again, but now with myFirstProtectedMethod! " + IM.myFirstProtectedMethod());
		System.out.println();
		System.out.println("This IM plus mySecondInt. \nI can call mySecondInt, becaause it's public! " + IM.mySecondInt);

	}

}
