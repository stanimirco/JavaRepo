package strings_13;

public class Equals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		areStringsEqual();
		compareStrings();
		stringsInterning();
		stringConcatenation();
	}
	
	private static void stringConcatenation(){
		String str1 = "Hello ";
		String str2 = "world!";
		String tmp = str1;
		
		System.out.println("stringConcatenation()");
		str1 += str2;
		System.out.println(str1);
		System.out.println(tmp == str1); // should be false
	}
	
	private static void stringsInterning(){
		String name = "name";
		String same = "name";
		
		System.out.println("stringsInterning()");
		
		// one and a same object
		System.out.println(name == same);
		
		String str1 = new String("name");
		String str2 = new String("name");
		
		// different objects
		System.out.println(str1 == str2);
	}
	
	private static void compareStrings(){
		String str1 = "post";
		String str2 = "stop";
		
		System.out.println("compareStrings():");
		System.out.println(str1.compareTo(str2));
	}
	
	private static void areStringsEqual(){
		String firstName = "Antonio";
		String secondName = "Samaramch";
		String str1 = "Stan";
		String str2 = "stan";
		
		System.out.println("areStringsEqual():");
		System.out.println(firstName.equalsIgnoreCase(secondName));
		System.out.println(str1.equalsIgnoreCase(str2));
	}

}
