package randomAccessFiles;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class DemoWriting {

	public static void main(String[] args) {

		char[] letters = {'a', 'b', 'c', 'd','e','f'};
		int[] numbers = {1,2,3,100,10000,100000};
		try {
			RandomAccessFile randomFile = new RandomAccessFile("letters.dat", "rw");
			RandomAccessFile randomFile2 = new RandomAccessFile("numbers.dat", "rw");
			System.out.println("writing to the file.... ");
			for (int i = 0; i < letters.length; i++) {
				randomFile.writeChar(letters[i]);
				randomFile2.writeInt(numbers[i]);
				System.out.print(letters[i]+" ");
			}
			randomFile.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			e.toString();
			e.getMessage();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{// finally will always run no matter what, its good for house cleaning in java
			System.out.println("done writing... ");

		}
	}

}
