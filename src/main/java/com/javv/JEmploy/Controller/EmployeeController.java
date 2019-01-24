package com.javv.JEmploy.Controller;

import org.springframework.boot.devtools.restart.RestartScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.javv.JEmploy.Bean.Employee;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.Date;;

@RestController
public class EmployeeController {

	@CrossOrigin(origins = "http://localhost:4200") 
	@RequestMapping(method=POST ,value="./employee" )
	public ResponseEntity<String> createEmployee(@RequestParam("profilePic")MultipartFile profilePic, @RequestBody Employee employee ){
		
		String fileName = profilePic.getName();
		String emailId = employee.getEmailId();
		Date dob = employee.getDob();
		String fullName =employee.getFullName();
		System.out.println(fileName+" :: "+emailId+" :: "+dob+" :: "+fullName);
		return ResponseEntity.status(HttpStatus.OK).body("successcfully sent");
	}
}
