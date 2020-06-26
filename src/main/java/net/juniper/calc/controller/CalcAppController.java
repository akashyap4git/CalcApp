package net.juniper.calc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.juniper.calc.dto.CalcDTO;
import net.juniper.calc.service.CalcAppService;

@RestController
public class CalcAppController {
	
	@Autowired
	private CalcAppService service;
	
	
	@GetMapping("/add")
	public String add(@RequestBody CalcDTO calcData) {
		int sum = service.addition(calcData.getNumber1(), calcData.getNumber2());
		return Integer.toString(sum);
	}

	@GetMapping("/sub")
	public String sub(@RequestBody CalcDTO calcData) {
		int sub = service.substraction(calcData.getNumber1(), calcData.getNumber2());
		return Integer.toString(sub);
	}

	@GetMapping("/mul")
	public String mul(@RequestBody CalcDTO calcData) {
		int mul = service.multiplication(calcData.getNumber1(), calcData.getNumber2());
		return Integer.toString(mul);
	}

	@GetMapping("/div")
	public String div(@RequestBody CalcDTO calcData) {
		int div = service.division(calcData.getNumber1(), calcData.getNumber2());
		return Integer.toString(div);
	}

}
