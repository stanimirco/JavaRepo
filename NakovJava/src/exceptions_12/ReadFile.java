package exceptions_12;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			readFile("test.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readFile(String fileName) throws IOException{
		
		FileInputStream fis = null;
		BufferedReader in = null;
		
		try{
			fis = new FileInputStream(fileName);
			in = new BufferedReader(new InputStreamReader(fis));
			String tmp = null;
			
			while( (tmp = in.readLine()) != null ){
				System.out.println(tmp);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			
			if (null != fis){
				fis.close();
			}
			
			if (null != in){
				in.close();
			}
			
		}
	}
	
}
