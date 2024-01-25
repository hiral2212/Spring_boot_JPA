package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.StudentService;

@Controller
@RequestMapping(path = "/student")

public class Mycontroller {
	@Autowired
	private StudentService studentService;

	@GetMapping()
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("index");
		// modelAndView.setViewName("index");
//		modelAndView.addObject("name", "Hiral Khaniya");
//		modelAndView.addObject("id", "11");
//		modelAndView.addObject("roll", "22222");
//		modelAndView.addObject("email", "testing");
//		modelAndView.addObject("phoneno","9904114483");
//		modelAndView.addObject("state","Gujarat");
//		modelAndView.addObject("city","jamnagr");
//		modelAndView.addObject("department","computer");
		// modelAndView.addObject("college_name","VGEc");
//		System.err.println(studentService.getAllData());
		modelAndView.addObject("students", studentService.getAllData());
		return modelAndView;
	}
}
