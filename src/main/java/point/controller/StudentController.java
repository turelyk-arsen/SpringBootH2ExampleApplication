package point.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import point.model.Student;
import point.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/student")
	public List<Student> getAllStudent() {
		return studentService.getAllStudent();
	}
	
	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable("id") int id) {
		return studentService.getStudentById(id);
	}
	
	@DeleteMapping("/student/{id}")
	public void deleteStudent(@PathVariable("id") int id) {
		studentService.delete(id);
	}
	
	@PostMapping("/student")
	public int saveStudent(@RequestBody Student student) {
		studentService.seveOrUpdate(student);
		return student.getId();
	}

}
