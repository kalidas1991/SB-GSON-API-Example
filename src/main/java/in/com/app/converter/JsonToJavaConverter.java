package in.com.app.converter;

import java.io.FileReader;

import com.google.gson.Gson;

import in.com.app.model.Student;

public class JsonToJavaConverter {
	public static void main(String[] args) throws Exception {
		Gson gson = new Gson();
		Student studnet = gson.fromJson(new FileReader("student.json"), Student.class);
		System.out.println(studnet);
	}
}
