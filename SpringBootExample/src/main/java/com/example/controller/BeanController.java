package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api")
public class BeanController {
	
	
	@GetMapping("/get")
	public ResponseEntity<String> getEmployee()
	{
		//returning a ResponseEntity with a body and status code.
		return new ResponseEntity<>("The employee details retrieved",HttpStatus.OK);
		
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<String> getEmployeeById(@PathVariable int id) {
	    // Use 'id' as needed in your logic
	    return new ResponseEntity<>("The employee details retrieved for id: " + id, HttpStatus.OK);
	}

	@PostMapping("/post/create")
	public  ResponseEntity<String> postEmployee()
	{
		
		return new ResponseEntity<>("The employee details retrieved",HttpStatus.CREATED);
		
	}
	@PutMapping("/put")
	public  ResponseEntity<String> updateEmployee()
	{
		
		return new ResponseEntity<>("The employee details retrieved",HttpStatus.OK);
	}
	@DeleteMapping("/delete")
	public  ResponseEntity<String> deleteEmployee()
	{
		return new ResponseEntity<>("The employee details retrieved",HttpStatus.OK);
		
	}
}