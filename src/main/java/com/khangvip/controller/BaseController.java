package com.khangvip.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.khangvip.bean.Person;

@Controller
public class BaseController {
	public static List<Person> persons=new ArrayList<Person>();
	static {
		persons.add(new Person("Khang","Dinh Quang"));
		persons.add(new Person("Khanh","Dinh Quang")) ;
	}
	@GetMapping(value= {"/","/home"})
	public String home(Model model) {
		model.addAttribute("persons", persons);
		return "home";
	}
	
}
