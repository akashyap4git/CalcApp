package net.juniper.calc.service;

import org.springframework.stereotype.Service;

@Service
public class CalcAppServiceImpl implements CalcAppService {
	
	private String s = "useless";

	@Override
	public int addition(int no1, int no2) {
		return no1 + no2;
	}

	@Override
	public int substraction(int no1, int no2) {
		return no1 - no2;
	}

	@Override
	public int multiplication(int no1, int no2) {
		return no1 * no2;
	}

	@Override
	public int division(int no1, int no2) {
		return no1 / no2;
	}

}
