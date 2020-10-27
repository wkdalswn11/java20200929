package chap18.textbook.s180501;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;						// 그냥쓰면 byte형으로 나오기때문에 문자열이 제대로 안나옴
		Reader reader = new InputStreamReader(is);		// 그래서 InputStreamReader 로 감싸서 사용하면 문자열이 제대로 나옴
		
		int readCharNo;
		char[] cbuf = new char[100];
		while ((readCharNo=reader.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		
		reader.close();
	}
}
