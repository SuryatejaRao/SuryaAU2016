package com.accolite.demo;

public interface Calculator {
	public Integer add(Integer a,Integer b);
	public Integer sub(Integer a,Integer b);
	public Long    mul(Integer a,Integer b);
	public Integer div(Integer a,Integer b) throws ArithmeticException;
	
}
