package com.cg.test;

import junit.framework.Assert;

import org.junit.Test;

import com.cg.bean.Calculator;

public class TestCalculator {

	@Test
	public void test_add(){
		Calculator calc=new Calculator();
		int res=calc.add(3, 4);
		Assert.assertEquals(7, res);
	}
	
	
	@Test
	public void test_subtract(){
		Calculator calc=new Calculator();
		int res=calc.subtract(10, 4);
		Assert.assertEquals(6, res);
	}
	
	
	@Test
	public void test_multiply(){
		Calculator calc=new Calculator();
		int res=calc.multiply(3, 4);
		Assert.assertEquals(12, res);
	}
	
	
	@Test
	public void test_square(){
		Calculator calc=new Calculator();
		int res=calc.calcSquare(3);
		Assert.assertEquals(9, res);
	}
	
	
	
}
