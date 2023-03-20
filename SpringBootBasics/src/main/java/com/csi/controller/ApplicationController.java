package com.csi.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// Done by Sakshi
@RestController
@RequestMapping("/")
public class ApplicationController {

	@GetMapping
	public String sayWorld() {
		return "Welcome to the World of Java";
	}
	
	@GetMapping("/house")
	public String sayHome() {
		return "Welcome to Home";
	}
	
	@GetMapping("/space")
	public String sayUniverse() {
		return "Universe is Everything";
	}
	
	@GetMapping("/listofdata")
	public List<Employee> getAllData(){
		return Stream.of(new Employee(121, "Sakshi"),new Employee(122, "Tejas")).collect(Collectors.toList());
	}
}
