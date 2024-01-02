package serialization_and_deserializationcom.jspiders.serialization.write;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import serialization_and_deserializationcom.jspiders.serialization.object.Student;

public class StudentSerialization {
	public static void main(String[] args) {
		try {
			File file = new File("Student.txt");
			file.createNewFile();

			try (FileOutputStream fileOutputStream = new FileOutputStream(file);
					ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

				Student student = new Student();
				student.setId(1);
				student.setName("Saurabh");
				student.setEmail("saurabhwaje4770@gmail.com");
				student.setAddress("fsnkjvbskjbvkj svsvbbibil");

				objectOutputStream.writeObject(student);
				System.out.println("Written Successfully....");

			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
