package objectIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Demo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Student s1 = new Student("Adam","111", "M");// after you put everything in the array and save the array
		Student s2 = new Student("bill","222", "M");// you don't need the objects you created because the array
		Student s3 = new Student("suzy","333", "F");// is already stored in the .dat binary file in the folder
		Student[] students = {s1,s2,s3};

		FileOutputStream fos = new FileOutputStream("students.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);// wrapper class

		/*for(int i = 0; i< students.length;i++){

			oos.writeObject(students[i]);// to save the objects individually
		}*/
		oos.writeObject(students);// to save the entire array
		oos.close();

		FileInputStream fis = new FileInputStream("students.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);// wrapper class
		/* for(int i = 0; i < 3; i++){
			 Student s = (Student) ois.readObject();
			 System.out.println(s.toString());
		 }*/
		Student[] studentArray = (Student[])ois.readObject();
		System.out.println(Arrays.toString((studentArray)));
		 ois.close();
	}

}
