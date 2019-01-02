package randomAccessFiles;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class DemoReading {

	public static void main(String[] args) {
		final long CHAR_SIZE = 2;// because chars are 2 bytes each
								// integers are 4 bytes each
								// double is 8 bytes
		final long INT_SIZE = 4;// because chars are 2 bytes each
								// integers are 4 bytes each
								 // double is 8 bytes

		try {
			RandomAccessFile randomFile = new RandomAccessFile("letters.dat", "r");
			randomFile.seek(CHAR_SIZE*3);// this positions the head of the reader
			char ch = randomFile.readChar();// this will do the reading
			System.out.println(ch);

			RandomAccessFile randomFile2 = new RandomAccessFile("letters.dat", "r");
			randomFile2.seek(INT_SIZE*3);// this positions the head of the reader
			int numbers = randomFile.readInt();
			System.out.println(numbers);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}finally{
			System.out.println("done reading ");
		}
	}

}
