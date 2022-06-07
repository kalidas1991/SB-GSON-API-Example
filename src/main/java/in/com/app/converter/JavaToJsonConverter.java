package in.com.app.converter;

import java.io.FileWriter;
import java.io.Writer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import in.com.app.model.Student;

public class JavaToJsonConverter {
	public static void main(String[] args) throws Exception {
		Student student = new Student();
		student.setSid(101);
		student.setName("Kalidas");
		student.setRank(255900);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		Writer writer = new FileWriter("student.json");
		gson.toJson(student, writer);
		writer.flush();
		writer.close();
	}

}
