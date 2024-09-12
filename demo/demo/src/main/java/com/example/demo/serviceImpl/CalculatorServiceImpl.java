package com.example.demo.serviceImpl;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{

	@Override
	public int addition(int a,int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int subtraction() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int multiplication() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int division() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addition(int a, int b, int c) {
		// TODO Auto-generated method stub
		return a+b+c;
	}

}
