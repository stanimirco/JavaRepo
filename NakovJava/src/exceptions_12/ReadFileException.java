package exceptions_12;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFileException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readFile("test.txt"); 
	}

	private static void readFile(String fileName){
		try{
			FileInputStream fis = new FileInputStream(fileName);
			BufferedReader in = new BufferedReader( new InputStreamReader(fis) );
			String tmp = null;
			
			while ( (tmp = in.readLine()) != null ){
				System.out.println(tmp);
			}
			
			in.close();
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
