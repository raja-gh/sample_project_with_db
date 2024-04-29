package com.testapp.postgres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository studentREpo;
	
	
	@PostMapping("/save")
	public String SaveStudent(@RequestBody Student student ) {
		studentREpo.save(student);
		
		return "Successfully stored";
		
	}

}
