package com.velocity.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.valves.StuckThreadDetectionValve;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	// Design the restful web service which return velocity
	
	@GetMapping("/getMessage")
	public String getMessage() {
		return "Hello Sandesh Sarade";
	}
	
	// Design the method which return list 
	@GetMapping("/	")
	public List<String> getStudentList(){
		List<String> list = new ArrayList<>();
		list.add("Sandesh");
		list.add("Piyush");
		list.add("Rahul");
		return list;
	}
	// Design the restful web service to return student object 
	@GetMapping("/getStudent")
	public Student getStudent() {
		Student student = new Student();
		student.setFirstname("Piyush");
		student.setLastname("Sarade");
		return student;
	}
}
