package com.spring.demo;

import org.springframework.stereotype.Service;

@Service
public class MethameticCalculation {
    public int calSqure(int value) {
		return value*value;
    }
    public int add(int a,int b) {
    	return a+b;
    }
    public int sub(int a,int b) {
    	return a-b;
    }
    public int multiply(int a,int b) {
    	return a*b;
    }
    public int divide(int a,int b) throws ArithmeticException {
    	return a/b;
    }
	
}
