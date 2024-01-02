package serialization_and_deserializationcom.jspiders.serialization.read;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import serialization_and_deserializationcom.jspiders.serialization.object.Student;

public class StudentDeserialization {
	public static void main(String[] args) {
		try (FileInputStream fileInputStream = new FileInputStream("Student.txt");
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

			Student student = (Student) objectInputStream.readObject();
			System.out.println(student);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
