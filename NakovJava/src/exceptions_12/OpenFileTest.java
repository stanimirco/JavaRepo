package exceptions_12;

import java.io.File;

public class OpenFileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("test.txt");
		
		if (false == f.exists()){
			System.out.println("File not found!");
		}
	}

}
