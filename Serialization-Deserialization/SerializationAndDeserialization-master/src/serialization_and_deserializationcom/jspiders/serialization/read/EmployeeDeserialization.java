package serialization_and_deserializationcom.jspiders.serialization.read;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import serialization_and_deserializationcom.jspiders.serialization.object.Employee;

public class EmployeeDeserialization {
	public static void main(String[] args) {
		try (FileInputStream fileInputStream = new FileInputStream("Employee.txt");
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

			Employee employee = (Employee) objectInputStream.readObject();
			System.out.println(employee);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
