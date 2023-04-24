package com.mvnparameter.controller;


import com.wsclientemploye.client.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@RequestMapping(value = "/employe", produces = { MediaType.APPLICATION_JSON_VALUE })
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class EmployeController {
	@Autowired
	com.mvnparameter.service.EmployeService employeService;

	//get method that is responsible for saving the employee information
	@GetMapping(value = "/saveEmploye/{name}/{lastName}/{documenttype}/{birthdate}/{companydate}/{post}/{salary}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> saveEmploye(@PathVariable(required = true) String name,
			@PathVariable(required = true) String lastName,
			@PathVariable(required = true) String documenttype,
			@PathVariable (required = true ) String birthdate,
			@PathVariable (required = true )  String companydate,
			@PathVariable(required = true) String post,
			@PathVariable(required = true) Double salary) {
		try {
			Response response = employeService.saveEmploye(name, lastName, documenttype, birthdate, companydate, post, salary);
			System.out.println(response);
			return new ResponseEntity<>(response, HttpStatus.OK);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}

	}
}
