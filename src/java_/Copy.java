package java_;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.OffsetDateTime;

public class Copy {

	public static void main(String[] args) throws FileNotFoundException {
		String string = "wobfgjb\nbfrgkejb\nbgdwkjb";
		FileOutputStream fileOutputStream = null;
		fileOutputStream = new FileOutputStream("src/java_/copy1.txt");
		try {
			fileOutputStream.write(string.getBytes());
			fileOutputStream.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (fileOutputStream != null) {
					fileOutputStream.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
