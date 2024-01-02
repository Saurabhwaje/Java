package serialization_and_deserializationcom.jspiders.serialization.write;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import serialization_and_deserializationcom.jspiders.serialization.object.Employee;

public class EmployeeSerialization {
	public static void main(String[] args) {
		try {
			File file = new File("Employee.txt");
			file.createNewFile();

			try (FileOutputStream fileOutputStream = new FileOutputStream(file);
					ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

				Employee employee = new Employee();
				employee.seteId(1);
				employee.seteName("Saurabh");
				employee.seteDept("xyz");

				objectOutputStream.writeObject(employee);
				System.out.println("Data written successfully..");

			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
