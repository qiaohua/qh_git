package java_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadTest {

	public static void main(String[] args) {
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream("C:/Users/Administrator/AppData/Roaming/kingsoft/office6/filelist.db");
			/*int result = fileInputStream.read();
			while(result != -1){
				System.out.print((char)result);
				result = fileInputStream.read();
			}*/
//			byte[]	ch = new byte[10];
			int len = fileInputStream.read();
			while(len != -1){
				System.out.print((char)len);
				len = fileInputStream.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (fileInputStream != null) {
					fileInputStream.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		

	}

}
