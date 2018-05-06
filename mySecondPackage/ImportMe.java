package mySecondPackage;

public class ImportMe {
	private int myFristInt = 1;
	public int mySecondInt = 2;
	
	public static String myFirstMethod() {
		return "This is myFirstMethod, it's a public and static method.";
	}
	static String myFirstDefaultMethod() {
		return "This myFirstDefaultMethod. \nI can only be called from classe in the same package.";
	}
	
	protected static String myFirstProtectedMethod() {
		return "This myFirstProtectedMethod. \nI can be called from any classes in that are in the same package. \nAnd I can be called from subclasses (extend.)";
	}

}
