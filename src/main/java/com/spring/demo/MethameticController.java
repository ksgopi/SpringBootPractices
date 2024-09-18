package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MethameticController {
	
	private MethameticCalculation meth;
    
	@Autowired
	private  MethameticCalculation methField;
	
	
	@Autowired
	public void setCalculator(MethameticCalculation maths) {
		this.meth=maths;
	}
	
	
	@GetMapping("/add/{a}/{b}")
	public String addTowValue(@PathVariable int a,@PathVariable int b) {
		int value=meth.add(a, b);
		return "Add tow value result is "+value;
	}
	@GetMapping("/sub/{a}/{b}")
	public String subTowValue(@PathVariable int a,@PathVariable int b) {
		int value=meth.sub(a, b);
		return "Sub tow value result is "+value;
	}
	@GetMapping("/divide/{a}/{b}")
	public String DivideTowValue(@PathVariable int a,@PathVariable int b) {
		int value=methField.divide(a, b);
		return "Divide tow value result is "+value;
	}
}
