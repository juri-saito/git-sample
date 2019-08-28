package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.logic.CalcLogic;

@Controller
@RequestMapping("/calc")
public class CalcController {

	@Autowired
	private CalcLogic calcLogic;
	
	@RequestMapping("/add")
	public String add() {
		int num1 = 11;
		int num2 = 22;
		
		int resultOfAdd = calcLogic.add(num1, num2);
		
		System.out.println(num1 + "+" + num2 + "=" + resultOfAdd);
		return "finished";
	}
	
	@RequestMapping("/sub")
	public String sub() {
		int num1 = 3;
		int num2 = 2;
		
		int resultOfSub = calcLogic.sub(num1, num2);
		
		System.out.println(num1 + "-" +num2 + "=" + resultOfSub);
		return "finished";
	}
	
	@RequestMapping("/multi")
	public String multi() {
		int num1 = 3;
		int num2 = 2;
		
		int resultOfMulti = calcLogic.multi(num1, num2);
		
		System.out.println(num1 + "*" + num2 + "=" + resultOfMulti);
		return "finished";
	}
	
	@RequestMapping("/div")
	public String div() {
		int num1 = 4;
		int num2 = 2;
		
		int resultOfDiv = calcLogic.div(num1, num2);
		
		System.out.println(num1 + "/" + num2 + "=" + resultOfDiv);
		return "finished";
	}
}
