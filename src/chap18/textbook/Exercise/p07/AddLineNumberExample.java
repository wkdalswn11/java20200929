package chap18.textbook.Exercise.p07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception{
		
		String filePath = "src/chap18/textbook/Exercise/p07/AddLineNumberExample.java";
		
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		
		String Line;
		int lineNum = 0;
		while ((Line = br.readLine()) != null) {
		
		lineNum++;
		System.out.println(lineNum + ":" + Line);
		
		}
		
		
		
		br.close();
		fr.close();
	}
}
